package com.cp_backend.service;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cp_backend.dao.QxcAwardDao;
import com.cp_backend.entity.QxcAward;

@Service
@Transactional
public class QxcAwardService {
	@Resource
	QxcAwardDao dao;
	
    private static final Logger logger = LoggerFactory.getLogger(QxcAwardService.class);
	
	public QxcAward insert(QxcAward qxcAward) {
        logger.info("新增test",qxcAward);
        return  dao.save(qxcAward);
    }

    public void delete(int id) {
        logger.info("删除实体，id为：" + id);
        dao.deleteById(id);
    }

    public void update (QxcAward u) {
        Optional<QxcAward> qxcAward1 = dao.findById(u.getId());
        qxcAward1.ifPresent(test -> {
            test.setName(u.getName());
            test.setNumber(u.getNumber());
        });
        logger.info("更新实体，id为" + u.getId());
    }

    public QxcAward find(int id) {
        logger.info("查找id为" + id + "的实体！");
        return dao.getOne(id);
    }
    public List<QxcAward> findAll() {
    	return dao.findAll();
    }

}
