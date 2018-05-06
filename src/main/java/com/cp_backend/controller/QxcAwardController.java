package com.cp_backend.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cp_backend.entity.QxcAward;
import com.cp_backend.service.QxcAwardService;
import com.cp_backend.util.Message;

@RestController
public class QxcAwardController {
	@Resource
	QxcAwardService service;
	
	@RequestMapping(value = "qxcAward",method = RequestMethod.POST)
    public Message save(QxcAward qxcAward){
        return Message.successMessage(service.insert(qxcAward));
    }

    @RequestMapping(value = "qxcAward/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }

    @RequestMapping(value = "qxcAward/{id}",method = RequestMethod.GET)
    public Message find(@PathVariable("id") int id) {
        QxcAward qxcAward = service.find(id);
        return Message.successMessage(qxcAward);
    }

    @RequestMapping(value = "qxcAward", method = RequestMethod.PUT)
    public void update(QxcAward qxcAward){
         service.update(qxcAward);
    }
    @RequestMapping(value = "qxcAward/findAll", method = RequestMethod.GET)
    public Message findAll(){
    	return Message.successMessage(service.findAll());
    }

}
