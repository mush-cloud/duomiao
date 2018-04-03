package com.duomiao.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public")
public class IndexControl {
    @RequestMapping("/index")
	public String accessIndexPage() {
		return "index";
	}
}
