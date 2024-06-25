package com.study.spring.bean;

public class LGTV implements ITV {
	public LGTV() {
		System.out.println("LGTV 생성");
	}
	@Override
	public void powerOn() {
		System.out.println("LGTV 켜기");
	}
	@Override
	public void powerOff() {
		System.out.println("LGTV 끄기");
	}
	@Override
	public void volumeUp() {
		System.out.println("LGTV소리 키우기");
	}
	@Override
	public void volumeDown() {
		System.out.println("LGTV소리 줄이기");
	}
}
