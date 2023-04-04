package org.jxch.capital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SSTestController {
    @GetMapping("/hello")
    public String hello() {
        return "欢迎访问";
    }
}
