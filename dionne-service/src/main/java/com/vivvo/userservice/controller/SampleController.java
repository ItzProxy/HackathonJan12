package com.vivvo.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample/{anotherSample}/sample")
public class SampleController {

  @GetMapping
  public String HelloSample(@PathVariable String anotherSample){
    return "Hello World";
  }

}
