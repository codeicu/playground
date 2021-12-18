package com.example.svc;

import com.example.annotation.Limit;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class LimitSvc  {


    @Limit(name = "limit5", key = "limit5key", count = 5, period = 60)
    public void limit5() {
        System.out.println("revoke limit5 1 time");
    }



}
