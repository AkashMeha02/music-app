package com.musicplatform.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{id}")
    public String getUserProfile(@PathVariable Long id, Model model) {
        // Fetch user data (mocked here)
        model.addAttribute("user", "User " + id);
        return "profile";
    }
    
    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        // Save user data (mocked here)
        return "Registration successful for " + user.getName();
    }
}
