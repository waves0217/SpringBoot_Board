package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TextContoller {
	
	@GetMapping("/qwer")
	//@ResponseBody
	public void root() {
		//return "TEST123";
		System.out.println("실행ㅇㅇ");
	}
}
