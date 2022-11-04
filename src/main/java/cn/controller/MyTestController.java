package cn.controller;

import cn.domain.TestRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyTestController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(TestRequest request) {
        System.out.println(request.getName());
        return "hello";
    }

    @RequestMapping("/hello2")
    @ResponseBody
    public String hello2(@RequestBody TestRequest request) {
        System.out.println("2*******"+request.getName());
        return "hello";
    }
}
