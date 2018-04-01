package com.cp_backend.service;

import com.cp_backend.dao.ExampleDao;
import com.cp_backend.entity.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Optional;

/**
 * Created by ljl on 2018/4/1.
 */
@Service
@Transactional
public class TestService {
    @Resource
    ExampleDao dao;

    public Test insert(Test test) {
        return  dao.save(test);
    }

    public void delete(int id) {
        dao.deleteById(id);
    }

    public void update (Test t) {
        Optional<Test> test1 = dao.findById(t.getId());
        test1.ifPresent(test -> {
            test.setName(t.getName());
            test.setAge(t.getAge());
        });
    }

    public Test find(int id) {
        return dao.getOne(id);
    }
}
