package com.cp_backend.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cp_backend.entity.User;
import com.cp_backend.service.UserService;
import com.cp_backend.util.Message;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ljl
 * @createTime 2018-04-01-13:56
 * @desc 样例controller
 **/





@RestController
public class UserController {

    @Resource
    UserService service;

    @RequestMapping(value = "user",method = RequestMethod.POST)
    public Message save(User user){
        return Message.successMessage(service.insert(user));
    }

    @RequestMapping(value = "user/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }

    @RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    public Message find(@PathVariable("id") int id) {
        User user = service.find(id);
        return Message.successMessage(user);
    }

    @RequestMapping(value = "user", method = RequestMethod.PUT)
    public void update(User user){
         service.update(user);
    }
    @RequestMapping(value = "user/findAll", method = RequestMethod.GET)
    public Message findAll(){
    	return Message.successMessage(service.findAll());
    }
    
}
