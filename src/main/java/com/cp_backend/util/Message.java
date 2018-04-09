package com.cp_backend.util;

import com.cp_backend.util.date.JsonDateValueProcessor;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by ljl on 2017/11/2.
 * 数据格式封装类
 * 主要用于规范后台返回数据以及浏览器请求的数据格式
 */
public class Message implements Serializable{
    private static final String ERROR = "error";
    private static final String SUCCESS = "success";

    // 状态码
    private int ret;
    // 内容体
    private Object data;
    // 携带信息
    private String msg;

    public Message() {
    }

    public Message(Object data) {
        this.ret = 200;
        this.data = data;
        this.msg = SUCCESS;
    }

    public  Message(int ret,String msg){
        this.ret = ret;
        this.msg = msg;
    }

    public Message(int ret, Object data, String msg) {
        this.ret = ret;
        this.data = data;
        this.msg = msg;
    }

    // 返回错误对象
    public static Message errorMessage(){
        return new Message(500,ERROR);
    }

    public static Message errorMessage(String msg){
        return new Message(500,msg);
    }

    // 返回成功对象
    public static Message successMessage(Object object){
        return new Message(200, object, SUCCESS);
    }
    // 返回成功对象
    public static Message successMessage(Object object,String msg){
        return new Message(200, object, msg);
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "{" +
                "ret=" + ret +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
