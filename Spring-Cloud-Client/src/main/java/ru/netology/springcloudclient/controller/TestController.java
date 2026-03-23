package ru.netology.springcloudclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @Value("${active.profiles}")
    private String fromConfiguration;

    @GetMapping("/config")
    public String getConfig() {
        return fromConfiguration;
    }
}