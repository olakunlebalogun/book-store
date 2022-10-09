package com.olakunle.bookstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/intro")
public class IndexController {

    @GetMapping("/git")
    public String welcomeMessage(){
        return "Glad to see that the git issue is resolved";
    }


}
