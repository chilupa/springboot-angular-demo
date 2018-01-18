package com.teckbyt.springboot.angularjs.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String homepage() {
		return "index";
	}
}
