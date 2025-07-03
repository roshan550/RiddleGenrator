package com.example.RiddleGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RiddleController {
    @Autowired
    private RiddleService riddleService;

    @GetMapping("/api/riddle")
    public Riddle getRiddle(@RequestParam(defaultValue = "en") String lang) {
        return riddleService.getRandomRiddle(lang);
    }
} 