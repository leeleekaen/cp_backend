package com.cp_backend.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cp_backend.entity.SsqAward;
import com.cp_backend.service.SsqAwardService;
import com.cp_backend.util.Message;

@RestController
public class SsqAwardController {
	@Resource
	SsqAwardService service;
	
	@RequestMapping(value = "ssqAward",method = RequestMethod.POST)
    public Message save(SsqAward ssqAward){
        return Message.successMessage(service.insert(ssqAward));
    }

    @RequestMapping(value = "ssqAward/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }

    @RequestMapping(value = "ssqAward/{id}",method = RequestMethod.GET)
    public Message find(@PathVariable("id") int id) {
        SsqAward ssqAward = service.find(id);
        return Message.successMessage(ssqAward);
    }

    @RequestMapping(value = "ssqAward", method = RequestMethod.PUT)
    public void update(SsqAward ssqAward){
         service.update(ssqAward);
    }
    @RequestMapping(value = "ssqAward/findAll", method = RequestMethod.GET)
    public Message findAll(){
    	return Message.successMessage(service.findAll());
    }

}
