package com.example.demo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
@RestController
public class ApiController {
    @GetMapping("message")
    public ResponseEntity<String> getText() {
        return ResponseEntity.ok("Я Щербатов Ярослав сделал работу и получилось создать и запустить сервис");
    }
}