package com.buildsim.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExpertController {
	   @GetMapping("/expert")
	    public String expert() {
	        return "expert";
	    }
}
