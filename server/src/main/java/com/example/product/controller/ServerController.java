package com.example.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品服务端，启动两个服务8080, 9080
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg() {
        return "this is product'msg 2";
    }
}
