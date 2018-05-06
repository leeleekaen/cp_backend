package com.cp_backend.service;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cp_backend.dao.OrderAllDao;
import com.cp_backend.entity.OrderAll;

@Service
@Transactional
public class OrderAllService {
	@Resource
	OrderAllDao dao;
	// 日志记录
    private static final Logger logger = LoggerFactory.getLogger(OrderAllService.class);
    
    
    public OrderAll insert(OrderAll orderAll) {
        logger.info("新增test",orderAll);
        return  dao.save(orderAll);
    }

    public void delete(int id) {
        logger.info("删除实体，id为：" + id);
        dao.deleteById(id);
    }

    public void update (OrderAll oa) {
        Optional<OrderAll> oa1 = dao.findById(oa.getId());
        oa1.ifPresent(test -> {
            test.setCpName(oa.getCpName());
            test.setCpNumber(oa.getCpNumber());
        });
        logger.info("更新实体，id为" + oa.getId());
    }

    public OrderAll find(int id) {
        logger.info("查找id为" + id + "的实体！");
        return dao.getOne(id);
    }
    public List<OrderAll> findAll() {
    	return dao.findAll();
    }


}
