package com.cos.photogramstart.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller // 1.IoC 2.파일을 리턴하는 컨트롤러
public class AuthController {
	
	  
	@GetMapping("/auth/signin")
	public String singinForm() {
		return "auth/signin";
	}
	
	@GetMapping("/auth/signup")
	public String singupForm() {
		return "auth/signup";
	}	
	 
	// 회원가입버튼 -> /auth/signup -> /auth/signin
	@PostMapping("/auth/signup")
	public String singup() {
		System.out.println("signup 실행");
		return "auth/signin";
	}
	
}
