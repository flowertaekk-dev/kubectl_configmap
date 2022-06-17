package com.example.configmap.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@lombok.Getter
@lombok.RequiredArgsConstructor
@ConstructorBinding
@ConfigurationProperties(prefix = "my-data")
public class MyConfig {

    private final String someId;
    private final String somePw;

}
