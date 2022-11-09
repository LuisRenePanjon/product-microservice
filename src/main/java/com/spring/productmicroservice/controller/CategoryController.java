package com.spring.productmicroservice.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
@Setter @Getter
@RefreshScope
public class CategoryController {

    @Value("${app.testProp}")
    private String testProps;

    @GetMapping("/test")
    @ResponseStatus(HttpStatus.OK)
    public String getTestProps() {
        return this.testProps;
    }

}
