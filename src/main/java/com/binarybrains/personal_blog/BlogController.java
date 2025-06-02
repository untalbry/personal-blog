package com.binarybrains.personal_blog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/blog")
public class BlogController {
    @GetMapping()
    public String getMethodName() {
        return new String("Hola mundo! " );
    }
}
