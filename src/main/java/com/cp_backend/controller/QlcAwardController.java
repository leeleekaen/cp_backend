package com.cp_backend.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cp_backend.entity.QlcAward;
import com.cp_backend.service.QlcAwardService;
import com.cp_backend.util.Message;

@RestController
public class QlcAwardController {
	@Resource
	QlcAwardService service;
	
	@RequestMapping(value = "qlcAward",method = RequestMethod.POST)
    public Message save(QlcAward qlcAward){
        return Message.successMessage(service.insert(qlcAward));
    }

    @RequestMapping(value = "qlcAward/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }

    @RequestMapping(value = "qlcAward/{id}",method = RequestMethod.GET)
    public Message find(@PathVariable("id") int id) {
        QlcAward qlcAward = service.find(id);
        return Message.successMessage(qlcAward);
    }

    @RequestMapping(value = "qlcAward", method = RequestMethod.PUT)
    public void update(QlcAward qlcAward){
         service.update(qlcAward);
    }
    @RequestMapping(value = "qlcAward/findAll", method = RequestMethod.GET)
    public Message findAll(){
    	return Message.successMessage(service.findAll());
    }

}
