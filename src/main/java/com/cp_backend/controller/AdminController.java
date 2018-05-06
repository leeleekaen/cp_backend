package com.cp_backend.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cp_backend.entity.Admin;
import com.cp_backend.service.AdminService;
import com.cp_backend.util.Message;

@RestController
public class AdminController {
	@Resource
	AdminService service;
	
	@RequestMapping(value = "admin",method = RequestMethod.POST)
    public Message save(Admin admin){
        return Message.successMessage(service.insert(admin));
    }

    @RequestMapping(value = "admin/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }

    @RequestMapping(value = "admin/{id}",method = RequestMethod.GET)
    public Message find(@PathVariable("id") int id) {
        Admin admin = service.find(id);
        return Message.successMessage(admin);
    }

    @RequestMapping(value = "admin", method = RequestMethod.PUT)
    public void update(Admin admin){
         service.update(admin);
    }
    @RequestMapping(value = "admin/findAll", method = RequestMethod.GET)
    public Message findAll(){
    	return Message.successMessage(service.findAll());
    }

}
