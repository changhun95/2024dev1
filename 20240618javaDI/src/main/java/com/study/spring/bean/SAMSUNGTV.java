package com.study.spring.bean;

public class SAMSUNGTV implements ITV {
	public SAMSUNGTV() {
		System.out.println("삼성 생성");
	}
	@Override
	public void powerOn() {
		System.out.println("삼성TV 켜기");
	}
	@Override
	public void powerOff() {
		System.out.println("삼성TV 끄기");
	}
	@Override
	public void volumeUp() {
		System.out.println("삼성TV소리 키우기");
	}
	@Override
	public void volumeDown() {
		System.out.println("삼성TV소리 줄이기");
	}
}
