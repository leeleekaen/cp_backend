package com.cp_backend.service;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cp_backend.dao.QlcAwardDao;
import com.cp_backend.entity.QlcAward;

@Service
@Transactional
public class QlcAwardService {
	@Resource
	QlcAwardDao dao;
	private static final Logger logger = LoggerFactory.getLogger(QlcAwardService.class);
	
	public QlcAward insert(QlcAward qlcAward){
        logger.info("新增test",qlcAward);
        return  dao.save(qlcAward);
    }
	
	public void delete(int id) {
        logger.info("删除实体，id为：" + id);
        dao.deleteById(id);
    }
	
	public void update (QlcAward u) {
		Optional<QlcAward> qlcAward1 = dao.findById(u.getId());
		qlcAward1.ifPresent(test -> {
            test.setName(u.getName());
            test.setNumber(u.getNumber());
        });
        logger.info("更新实体，id为" + u.getId());
	}
	
	public QlcAward find(int id) {
        logger.info("查找id为" + id + "的实体！");
        return dao.getOne(id);
    }
    public List<QlcAward> findAll() {
    	return dao.findAll();
    }

}
