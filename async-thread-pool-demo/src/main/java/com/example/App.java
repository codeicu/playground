package com.example;

import cn.hutool.core.thread.ThreadUtil;
import com.example.svc.AsyncSvc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Slf4j
public class App implements CommandLineRunner {

    @Autowired
    AsyncSvc asyncSvc;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 100; i++) {
            asyncSvc.waitAndPrint();
        }
    }
}
