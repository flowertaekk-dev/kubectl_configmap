package com.example.configmap.controller;

import com.example.configmap.config.MyConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@lombok.RequiredArgsConstructor
@RequestMapping("v1/hello")
@RestController
public class HelloController {

    private final MyConfig myConfig;

    @GetMapping
    public Mono<String> hello() {
        System.out.println("ok");
        return Mono.just(myConfig.getSomeId() + ", " + myConfig.getSomePw());
    }
}
