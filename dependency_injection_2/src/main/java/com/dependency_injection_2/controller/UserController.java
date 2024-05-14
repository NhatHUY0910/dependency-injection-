package com.dependency_injection_2.controller;

import com.dependency_injection_2.service.EmailService;
import com.dependency_injection_2.service.MessageService;

public class UserController {
    private MessageService messageService;

    public UserController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send() {
        messageService.sendMessage("Hello Dependency Injection Pattern");
    }
}
