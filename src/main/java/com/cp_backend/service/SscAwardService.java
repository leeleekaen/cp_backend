package com.cp_backend.service;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cp_backend.dao.SscAwardDao;
import com.cp_backend.entity.DltAward;
import com.cp_backend.entity.SscAward;

@Service
@Transactional
public class SscAwardService {
	@Resource
	SscAwardDao dao;
    private static final Logger logger = LoggerFactory.getLogger(SscAwardService.class);
	
	public SscAward insert(SscAward sscAward) {
        logger.info("新增test",sscAward);
        return  dao.save(sscAward);
    }

    public void delete(int id) {
        logger.info("删除实体，id为：" + id);
        dao.deleteById(id);
    }

    public void update (SscAward u) {
        Optional<SscAward> sscAward1 = dao.findById(u.getId());
        sscAward1.ifPresent(test -> {
            test.setName(u.getName());
            test.setNumber(u.getNumber());
        });
        logger.info("更新实体，id为" + u.getId());
    }

    public SscAward find(int id) {
        logger.info("查找id为" + id + "的实体！");
        return dao.getOne(id);
    }
    public List<SscAward> findAll() {
    	return dao.findAll();
    }

}
