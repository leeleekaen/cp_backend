package com.cp_backend.service;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cp_backend.dao.Fc3AwardDao;
import com.cp_backend.entity.Fc3Award;

@Service
@Transactional
public class Fc3AwardService {
	@Resource
	Fc3AwardDao dao;
    private static final Logger logger = LoggerFactory.getLogger(Fc3AwardService.class);
	
	public Fc3Award insert(Fc3Award fc3Award) {
        logger.info("新增test",fc3Award);
        return  dao.save(fc3Award);
    }

    public void delete(int id) {
        logger.info("删除实体，id为：" + id);
        dao.deleteById(id);
    }

    public void update (Fc3Award u) {
        Optional<Fc3Award> fc3Award1 = dao.findById(u.getId());
        fc3Award1.ifPresent(test -> {
            test.setName(u.getName());
            test.setNumber(u.getNumber());
        });
        logger.info("更新实体，id为" + u.getId());
    }

    public Fc3Award find(int id) {
        logger.info("查找id为" + id + "的实体！");
        return dao.getOne(id);
    }
    public List<Fc3Award> findAll() {
    	return dao.findAll();
    }

}
