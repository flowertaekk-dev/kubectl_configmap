package com.example.configmap;

import com.example.configmap.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = { MyConfig.class })
public class ConfigmapApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigmapApplication.class, args);
    }

}
