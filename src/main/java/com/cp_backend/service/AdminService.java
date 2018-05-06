package com.cp_backend.service;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cp_backend.dao.AdminDao;
import com.cp_backend.entity.Admin;


@Service
@Transactional
public class AdminService {
	@Resource
    AdminDao dao;
	
	private static final Logger logger = LoggerFactory.getLogger(AdminService.class);
	
	public Admin insert(Admin admin) {
        logger.info("新增test",admin);
        return  dao.save(admin);
    }
	
	public void delete(int id) {
        logger.info("删除实体，id为：" + id);
        dao.deleteById(id);
    }
	
	public void update (Admin u) {
        Optional<Admin> user1 = dao.findById(u.getId());
        user1.ifPresent(test -> {
            test.setName(u.getName());
            test.setPassword(u.getPassword());
        });
        logger.info("更新实体，id为" + u.getId());
    }
	
	public Admin find(int id) {
        logger.info("查找id为" + id + "的实体！");
        return dao.getOne(id);
    }
    public List<Admin> findAll() {
    	return dao.findAll();
    }

}
