package com.study.spring.bean;

public class LgTv implements ITv{
	public LgTv() {
		System.out.println("LGTV 생성");
	}
	public void powerOff() {
		System.out.println("LGTV 끄기");
	}
	public void volumeUp() {
		System.out.println("LGTV소리 키우기");
	}
	public void powerOn() {
		System.out.println("LGTV 켜기");
	}
	public void volumeDown() {
		System.out.println("LGTV소리 줄이기");
	}
}
