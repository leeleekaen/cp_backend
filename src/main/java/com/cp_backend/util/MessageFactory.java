package com.cp_backend.util;

import com.cp_backend.dao.ExampleDao;
import com.cp_backend.util.date.JsonDateValueProcessor;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import java.util.Date;

/**
 * Created by sheriff on 2017/11/14.
 * 主要用于构造不同的消息
 */
public class MessageFactory {
    private static JsonConfig jsonConfig = new JsonConfig();
    static {
        jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
    }

    public static String getSuccessMessage(Object obj){
        Message message = Message.successMessage(obj);
        try {
            String mes = JSONObject.fromObject(message, jsonConfig).toString();
            return mes;
        } catch (Exception e) {
            e.printStackTrace();

        }
       return "111";
    }

    public static String getSuccessMessage(Object obj, String msg) {
        return JSONObject.fromObject(Message.successMessage(obj, msg), jsonConfig).toString();
    }
    
    public static String getErrorMessage() {
    	return JSONObject.fromObject(Message.errorMessage()).toString();
	}

    public static String getErrorMessage(String msg) {
        return JSONObject.fromObject(Message.errorMessage(msg)).toString();
    }

}
