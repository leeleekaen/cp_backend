package com.cp_backend.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cp_backend.entity.Fc3Award;
import com.cp_backend.service.Fc3AwardService;
import com.cp_backend.util.Message;

@RestController
public class Fc3AwardController {
	@Resource
	Fc3AwardService service;
	
	@RequestMapping(value = "fc3Award",method = RequestMethod.POST)
    public Message save(Fc3Award fc3Award){
        return Message.successMessage(service.insert(fc3Award));
    }

    @RequestMapping(value = "fc3Award/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }

    @RequestMapping(value = "fc3Award/{id}",method = RequestMethod.GET)
    public Message find(@PathVariable("id") int id) {
        Fc3Award fc3Award = service.find(id);
        return Message.successMessage(fc3Award);
    }

    @RequestMapping(value = "fc3Award", method = RequestMethod.PUT)
    public void update(Fc3Award fc3Award){
         service.update(fc3Award);
    }
    @RequestMapping(value = "fc3Award/findAll", method = RequestMethod.GET)
    public Message findAll(){
    	return Message.successMessage(service.findAll());
    }

}
