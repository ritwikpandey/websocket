package com.ritwik.chat.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
 
@SpringBootApplication
@ComponentScan({"com.ritwik.chat"})
public class ChatApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(ChatApplication.class, args);
    }
     
}