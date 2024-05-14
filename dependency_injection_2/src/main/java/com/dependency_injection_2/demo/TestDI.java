package com.dependency_injection_2.demo;

import com.dependency_injection_2.controller.UserController;
import com.dependency_injection_2.service.EmailService;
import com.dependency_injection_2.service.MessageService;

public class TestDI {
    public static void main(String[] args) {
        MessageService messageService = new EmailService();
        UserController userController = new UserController(messageService);
        userController.send();
    }
}
