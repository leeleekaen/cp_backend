package com.cp_backend.service;

import com.cp_backend.dao.ExampleDao;
import com.cp_backend.entity.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Created by ljl on 2018/4/1.
 */
@Service
@Transactional
public class TestService {
    @Resource
    ExampleDao dao;

    // 日志记录
    private static final Logger logger = LoggerFactory.getLogger(TestService.class);

    public Test insert(Test test) {
        logger.info("新增test",test);
        return  dao.save(test);
    }

    public void delete(int id) {
        logger.info("删除实体，id为：" + id);
        dao.deleteById(id);
    }

    public void update (Test t) {
        Optional<Test> test1 = dao.findById(t.getId());
        test1.ifPresent(test -> {
            test.setName(t.getName());
            test.setAge(t.getAge());
        });
        logger.info("更新实体，id为" + t.getId());
    }

    public Test find(int id) {
        logger.info("查找id为" + id + "的实体！");
        return dao.getOne(id);
    }

    public List<Test> findAll(){
        return dao.findAll();
    }
}
