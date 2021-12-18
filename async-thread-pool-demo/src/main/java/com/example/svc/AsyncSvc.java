package com.example.svc;

import cn.hutool.core.thread.ThreadUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AsyncSvc {

    @Async
    public void waitAndPrint() {
        ThreadUtil.sleep(2000);
        log.info("async waitAndPrint");
    }
}
