package com.spring.core.di;

import org.springframework.stereotype.Component;

@Component
public interface MessageService {

    void sendMessage(String message);
}
