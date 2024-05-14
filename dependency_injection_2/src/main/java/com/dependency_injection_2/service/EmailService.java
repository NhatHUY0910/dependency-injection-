package com.dependency_injection_2.service;

public class EmailService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("email message: " + message);
    }
}
