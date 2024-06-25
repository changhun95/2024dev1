package com.study.spring.bean;

public class SONYTV implements ITV {
	public SONYTV() {
		System.out.println("소니 생성");
	}
	@Override
	public void powerOn() {
		System.out.println("소니TV 켜기");
	}
	@Override
	public void powerOff() {
		System.out.println("소니TV 끄기");
	}
	@Override
	public void volumeUp() {
		System.out.println("소니TV소리 키우기");
	}
	@Override
	public void volumeDown() {
		System.out.println("소니TV소리 줄이기");
	}
}
