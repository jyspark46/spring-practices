package com.poscodx.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@ResponseBody
	//@RequestMapping("/") // 꼭 필요함 !!!
	@RequestMapping({"/", "/main", "/a/b/c/main"}) // 여러 개도 가능 !!
	public String main() {
		return "MainController.main()";
	}
}