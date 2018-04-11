package com.cp_backend.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.*;


@Entity
@Table(name = "user")
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "password")
	private String password;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "true_name")
	private String trueName;
	@Column(name = "sex")
	private String sex;
	@Column(name = "age")
	private Integer age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", phoneNumber=" + phoneNumber
				+ ", trueName=" + trueName + ", sex=" + sex + ", age=" + age + "]";
	}
	
}
