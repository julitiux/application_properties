package com.application_properties.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {

  @Value("${spring.application.name}")
  private String nameApplication;

  @GetMapping(value = "/")
  public @ResponseBody String getApplicationName() {
    return nameApplication;
  }

}
