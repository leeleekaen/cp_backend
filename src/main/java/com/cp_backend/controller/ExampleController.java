package com.cp_backend.controller;

import com.cp_backend.entity.Test;
import com.cp_backend.service.TestService;
import com.cp_backend.util.Message;
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
public class ExampleController {

    @Resource
    TestService service;
    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    public String hello (@PathVariable("id") String id) {
        return id + "hello world";
    }

    @RequestMapping(value = "Test",method = RequestMethod.POST)
    public Message save(Test test){
        return Message.successMessage(service.insert(test));
    }

    @RequestMapping(value = "Test/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }

    @RequestMapping(value = "Test/{id}",method = RequestMethod.GET)
    public Message find(@PathVariable("id") int id) {
        Test test = service.find(id);
        return Message.successMessage(test);
    }

    @RequestMapping(value = "Tests",method = RequestMethod.GET)
    public Message findAll() {
        return Message.successMessage(service.findAll());
    }

    @RequestMapping(value = "Test", method = RequestMethod.PUT)
    public void update(Test test){
         service.update(test);
    }
}
