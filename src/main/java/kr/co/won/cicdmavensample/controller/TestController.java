package kr.co.won.cicdmavensample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/")
public class TestController {

    @GetMapping
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
