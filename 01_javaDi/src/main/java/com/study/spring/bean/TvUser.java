package com.study.spring.bean;

public class TvUser {
	public static void main(String[] args) {

		
		BeanContainer container = new BeanContainer();
		
		ITv tv = (ITv)container.getBean(args[0]);
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

	}
	
}