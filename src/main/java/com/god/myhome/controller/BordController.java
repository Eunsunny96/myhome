package com.god.myhome.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BordController {

    @GetMapping("/list")
    public String list(){
        return "board/list";
    }

}
