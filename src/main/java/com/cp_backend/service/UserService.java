package com.cp_backend.service;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cp_backend.dao.UserDao;
import com.cp_backend.entity.User;

/**
 * Created by ltb on 2018/4/9.
 */
@Service
@Transactional
public class UserService {
    @Resource
    UserDao dao;

    // 日志记录
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public User insert(User user) {
        logger.info("新增test",user);
        return  dao.save(user);
    }

    public void delete(int id) {
        logger.info("删除实体，id为：" + id);
        dao.deleteById(id);
    }

    public void update (User u) {
        Optional<User> user1 = dao.findById(u.getId());
        user1.ifPresent(test -> {
            test.setName(u.getName());
            test.setAge(u.getAge());
        });
        logger.info("更新实体，id为" + u.getId());
    }

    public User find(int id) {
        logger.info("查找id为" + id + "的实体！");
        return dao.getOne(id);
    }
    public Page<User> findAll(int pageNumber, int pageSize) {
    	return dao.findAll(new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "id"));
    	// 先筛选后分页
//        User user = new User();
//        user.setName("1");
//    	dao.findAll(Example.of(user), new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "id"));
    }
}
