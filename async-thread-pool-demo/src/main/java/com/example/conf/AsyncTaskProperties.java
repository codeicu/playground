package com.example.conf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "task.pool")
public class AsyncTaskProperties {

    private int corePoolSize = 4;

    private int maxPoolSize = 20;

    private int keepAliveSeconds = 60;

    private int queueCapacity = 4;
}
