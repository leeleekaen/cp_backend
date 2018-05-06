package com.cp_backend.service;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cp_backend.dao.DltAwardDao;
import com.cp_backend.entity.DltAward;

@Service
@Transactional
public class DltAwardService {
	@Resource
	DltAwardDao dao;
	private static final Logger logger = LoggerFactory.getLogger(DltAwardService.class);
	
	public DltAward insert(DltAward dltAward) {
        logger.info("新增test",dltAward);
        return  dao.save(dltAward);
    }

    public void delete(int id) {
        logger.info("删除实体，id为：" + id);
        dao.deleteById(id);
    }

    public void update (DltAward u) {
        Optional<DltAward> dltAward1 = dao.findById(u.getId());
        dltAward1.ifPresent(test -> {
            test.setName(u.getName());
            test.setNumber(u.getNumber());
        });
        logger.info("更新实体，id为" + u.getId());
    }

    public DltAward find(int id) {
        logger.info("查找id为" + id + "的实体！");
        return dao.getOne(id);
    }
    public List<DltAward> findAll() {
    	return dao.findAll();
    }

}
