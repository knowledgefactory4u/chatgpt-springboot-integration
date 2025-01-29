package com.example.chatgpt.controller;

import com.example.chatgpt.service.OpenAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OpenAiController {

    @Autowired
    private OpenAiService openAiService;

    @GetMapping("/generate-text")
    public String generateText(@RequestParam String prompt) {
        return openAiService.generateText(prompt);
    }
}
