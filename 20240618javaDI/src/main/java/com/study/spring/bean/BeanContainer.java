package com.study.spring.bean;

public class BeanContainer {
	public Object getBean(String id) {
		if(id.equals("lg")) {
			return new LGTV();
		}else if(id.equals("samsung")) {
			return new SAMSUNGTV();
		}else if(id.equals("sony")) {
			return new SONYTV();
		}
		return null;
	}
}