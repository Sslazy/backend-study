package org.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplyController {

    @PostMapping("apply")
    public String apply(@RequestParam(value = "username",defaultValue = "Sslazy") String username,
                        @RequestParam String course,
                        @RequestParam List<Integer> purpose){
        return "{\"用户名\": " + username + ",\"课程\":" + course + ",\"目的\": " + purpose + "}";
    }
}
