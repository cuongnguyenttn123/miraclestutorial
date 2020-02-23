package miraclesgroup.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/miracles")
public class MiraclesController {
    @GetMapping
    public String findAll(){
        return "project Hướng dẫn Spring Boot và Hibernate Framework";
    }
}
