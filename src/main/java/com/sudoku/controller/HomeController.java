package com.sudoku.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mangirdas on 2016-05-14.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "WORKING!!!";
    }
}
