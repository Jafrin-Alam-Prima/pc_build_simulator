package com.buildsim.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommunityController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/community")
    public String community(Model model) {
        
        String userEmail = "user@example.com"; //

        User user = userRepository.findByEmail(userEmail);

        if (user != null) {
            model.addAttribute("username", user.getUsername());
        }

        return "community";
    }
}
