package com.cp_backend.service;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cp_backend.dao.SsqAwardDao;
import com.cp_backend.entity.DltAward;
import com.cp_backend.entity.SsqAward;

@Service
@Transactional
public class SsqAwardService {
	@Resource
	SsqAwardDao dao;
	
    private static final Logger logger = LoggerFactory.getLogger(SsqAwardService.class);
	
	public SsqAward insert(SsqAward ssqAward) {
        logger.info("新增test",ssqAward);
        return  dao.save(ssqAward);
    }

    public void delete(int id) {
        logger.info("删除实体，id为：" + id);
        dao.deleteById(id);
    }

    public void update (SsqAward u) {
        Optional<SsqAward> ssqAward1 = dao.findById(u.getId());
        ssqAward1.ifPresent(test -> {
            test.setName(u.getName());
            test.setNumber(u.getNumber());
        });
        logger.info("更新实体，id为" + u.getId());
    }

    public SsqAward find(int id) {
        logger.info("查找id为" + id + "的实体！");
        return dao.getOne(id);
    }
    public List<SsqAward> findAll() {
    	return dao.findAll();
    }

}
