package com.cp_backend.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cp_backend.entity.DltAward;
import com.cp_backend.entity.SscAward;
import com.cp_backend.service.SscAwardService;
import com.cp_backend.util.Message;

@RestController
public class SscAwardController {
	@Resource
	SscAwardService service;
	
	@RequestMapping(value = "sscAward",method = RequestMethod.POST)
    public Message save(SscAward sscAward){
        return Message.successMessage(service.insert(sscAward));
    }

    @RequestMapping(value = "sscAward/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }

    @RequestMapping(value = "sscAward/{id}",method = RequestMethod.GET)
    public Message find(@PathVariable("id") int id) {
        SscAward sscAward = service.find(id);
        return Message.successMessage(sscAward);
    }

    @RequestMapping(value = "sscAward", method = RequestMethod.PUT)
    public void update(SscAward sscAward){
         service.update(sscAward);
    }
    @RequestMapping(value = "sscAward/findAll", method = RequestMethod.GET)
    public Message findAll(){
    	return Message.successMessage(service.findAll());
    }

}
