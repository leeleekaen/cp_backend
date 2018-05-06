package com.cp_backend.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cp_backend.entity.DltAward;
import com.cp_backend.service.DltAwardService;
import com.cp_backend.util.Message;

@RestController
public class DltAwardController {
	@Resource
	DltAwardService service;
	
	@RequestMapping(value = "dltAward",method = RequestMethod.POST)
    public Message save(DltAward dltAward){
        return Message.successMessage(service.insert(dltAward));
    }

    @RequestMapping(value = "dltAward/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }

    @RequestMapping(value = "dltAward/{id}",method = RequestMethod.GET)
    public Message find(@PathVariable("id") int id) {
        DltAward dltAward = service.find(id);
        return Message.successMessage(dltAward);
    }

    @RequestMapping(value = "dltAward", method = RequestMethod.PUT)
    public void update(DltAward dltAward){
         service.update(dltAward);
    }
    @RequestMapping(value = "dltAward/findAll", method = RequestMethod.GET)
    public Message findAll(){
    	return Message.successMessage(service.findAll());
    }

}
