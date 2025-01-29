package com.example.chatgpt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ai.openai.client.OpenAiClient;
import org.springframework.ai.openai.model.CompletionRequest;
import org.springframework.ai.openai.model.CompletionResponse;

@Service
public class OpenAiService {

    @Autowired
    private OpenAiClient openAiClient;

    public String generateText(String prompt) {
        CompletionRequest request = new CompletionRequest();
        request.setPrompt(prompt);
        request.setMaxTokens(100);

        CompletionResponse response = openAiClient.createCompletion(request);
        return response.getChoices().get(0).getText().trim();
    }
}
