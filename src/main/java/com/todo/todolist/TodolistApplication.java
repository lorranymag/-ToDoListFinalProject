package com.todo.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.awt.Desktop;
import java.net.URI;

@SpringBootApplication
public class TodolistApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodolistApplication.class, args);

        // Open browser automatically
        try {
            Desktop.getDesktop().browse(new URI("http://localhost:8080"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
@EventListener(ApplicationReadyEvent.class)
public void openBrowser() {

    new Thread(() -> {
        try {
            Thread.sleep(2000);

            Runtime.getRuntime().exec("open http://localhost:8080");

        } catch (Exception e) {
            e.printStackTrace();
        	}
    	}).start();
	}
}