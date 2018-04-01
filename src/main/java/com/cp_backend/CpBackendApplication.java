package com.cp_backend;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class CpBackendApplication {

	public static void main(String[] args) {
		Process process  = null;
		try {
			process = Runtime.getRuntime().exec("G:/dcmp-decryption.exe -func=mac");
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		SpringApplication.run(CpBackendApplication.class, args);
	}

	/**
	 * 注册DruidServlet
	 *
	 * @return
	 */
	@Bean
	public ServletRegistrationBean druidServletRegistrationBean() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
		servletRegistrationBean.setServlet(new StatViewServlet());
		servletRegistrationBean.addUrlMappings("/druid/*");
		return servletRegistrationBean;
	}

	/**
	 * 注册DruidFilter拦截
	 *
	 * @return
	 */
	@Bean
	public FilterRegistrationBean duridFilterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new WebStatFilter());
		Map<String, String> initParams = new HashMap<String, String>();
		//设置忽略请求
		initParams.put("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
		filterRegistrationBean.setInitParameters(initParams);
		filterRegistrationBean.addUrlPatterns("/*");
		return filterRegistrationBean;
	}

	/**
	 * 配置DataSource
	 * @return
	 * @throws SQLException
	 */
	@Bean
	public DataSource druidDataSource() throws SQLException {
		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setUsername("root");
		druidDataSource.setPassword("123456");
		druidDataSource.setUrl("jdbc:mysql://localhost:3306/cp");
		druidDataSource.setMaxActive(100);
		druidDataSource.setFilters("stat,wall");
		druidDataSource.setInitialSize(10);
		return druidDataSource;
	}

}
