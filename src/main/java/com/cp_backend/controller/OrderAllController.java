package com.cp_backend.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.cp_backend.entity.OrderAll;
import com.cp_backend.entity.User;
import com.cp_backend.service.OrderAllService;
import com.cp_backend.util.Message;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class OrderAllController {
	@Resource
	OrderAllService service;
	
	/*@RequestMapping(value = "order_all",method = RequestMethod.POST)
    public Message save(OrderAll orderAll){
        return Message.successMessage(service.insert(orderAll));
    }*/
	
	
	@RequestMapping(value = "order_all",method = RequestMethod.POST)
    public Message save(@RequestParam("list")String list) throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper mapper=new ObjectMapper();
		JavaType javaType=mapper.getTypeFactory().constructParametricType(List.class, OrderAll.class);
		List<OrderAll> list2=mapper.readValue(list, javaType);
		//System.err.println(list2.get(0).getCpName());
		for (int i = 0; i < list2.size(); i++) {
			service.insert(list2.get(i));
		}
		return null;
    }
	
	
	@RequestMapping(value = "order_all/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }
	
	@RequestMapping(value = "order_all/{id}",method = RequestMethod.GET)
    public Message find(@PathVariable("id") int id) {
		OrderAll orderAll = service.find(id);
        return Message.successMessage(orderAll);
    }
	
	@RequestMapping(value = "order_all", method = RequestMethod.PUT)
    public void update(OrderAll orderAll){
         service.update(orderAll);
    }
	
	@RequestMapping(value = "order_all/findAll", method = RequestMethod.GET)
    public Message findAll(){
    	return Message.successMessage(service.findAll());
    }

}
