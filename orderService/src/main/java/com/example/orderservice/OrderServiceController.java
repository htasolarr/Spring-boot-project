package com.example.orderservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")

public class OrderServiceController {
    @GetMapping
    public String greeting(){
        return "hello world";
    }

}
