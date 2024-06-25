package com.study.spring;

import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

	@RequestMapping("/")
	public @ResponseBody String root() {
		return "params";
	}
	
	@RequestMapping("/index")
	public String index(HttpServletRequest httpServletRequest, Model model) {
		String name = httpServletRequest.getParameter("name");
		String id = httpServletRequest.getParameter("id");
		
		model.addAttribute("name",name);
		// http://localhost:8080/index?name=test 경로로 들어가야 함
		// get방식
		model.addAttribute("id",id);
		// 두개 받아올 땐 &로 연결 _ http://localhost:8080/index?name=test&id=testtt 경로로 들어가야 함
		return "index";
	}
	@RequestMapping("/test1")
	public String test1(
			@RequestParam("id") String id,
			@RequestParam("name") String name,
			Model model
			) {
		model.addAttribute("name",name);
		model.addAttribute("id",id);
		//http://localhost:8080/test1?id=test&name=test
		return "test1";
	}
	@RequestMapping("/test2")
	public String test2(Member member, Model model) {
//		model.addAttribute("name",member.getName());
//		model.addAttribute("id",member.getId());
		//http://localhost:8080/test2?id=test&name=test
		return "test2";
	}
	@RequestMapping("/test3/{studentId}/{name}")    
	public String test3(
			
			@PathVariable("studentId") String studentId,
			@PathVariable("name") String name,
			Model model
			) {
		model.addAttribute("id",studentId);
		model.addAttribute("name",name);
		return "test3";
	}
	
}
