package com.example.annotation;

import com.example.svc.LimitSvc;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class LimitAspectTest {

    @Autowired
    LimitSvc limitSvc;

    @Test
    void testLimit(){
        for (int i = 0; i < 4; i++) {
            limitSvc.limit5();
        }
        assertThrows(Exception.class,()->{
           limitSvc.limit5();
        });
    }
}