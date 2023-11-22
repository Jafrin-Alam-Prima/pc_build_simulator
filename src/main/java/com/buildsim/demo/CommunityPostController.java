package com.buildsim.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommunityPostController {

	@GetMapping("/community_posts")
	public String community_posts() {
	    return "community_posts";
	}
}

