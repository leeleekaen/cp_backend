package com.cp_backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ljl on 2018/4/15.
 */
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" }) // 忽略多余字段
public interface EntityInterface {
}
