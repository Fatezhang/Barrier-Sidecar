package com.barrier.sidecar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/barrier/protected")
public class BarrierProtectedStuffsController {

    @GetMapping("test")
    public String test() {
        return "OK";
    }
}
