package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

   @RequestMapping(value = "/test", method = RequestMethod.GET)
   public Object test() {
       return "test";
   }

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
   public Object test1() {
       return "test1";
   }

}
