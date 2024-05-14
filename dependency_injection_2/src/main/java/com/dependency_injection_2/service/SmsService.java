package com.dependency_injection_2.service;

public class SmsService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS message: " + message);
    }
}
