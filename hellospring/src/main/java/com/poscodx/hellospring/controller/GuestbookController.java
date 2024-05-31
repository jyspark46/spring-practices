package com.poscodx.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @RequestMapping 클래스 단독 매핑
 * Spring MVC 4.x 지원(여기는 5.x 이므로 안됨)
 */
//@Controller --> 이렇게 하면 오류 X
@RequestMapping("/guestbook/*")
public class GuestbookController {
	@ResponseBody
	@RequestMapping
	public String list() {
		return "GuestbookController.list()";
	}
	
	@ResponseBody
	@RequestMapping
	public String delete() {
		return "GuestbookController.delete()";
	}
}