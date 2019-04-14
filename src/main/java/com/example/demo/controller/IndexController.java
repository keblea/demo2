package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index/")
public class IndexController {
	
	@RequestMapping("test")
	public String index() {
		return "hello spring boot";

	}
	@RequestMapping("hello")
	public String hello() {
		return "hello spring boot";
	}
}
