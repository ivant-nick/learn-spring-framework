package com.spring.core.di;

import org.springframework.stereotype.Component;

@Component
public class SMSService implements MessageService {

    @Override
    public void sendMessage (String message){
        System.out.println(message);
    }
}
