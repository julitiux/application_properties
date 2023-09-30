package com.application_properties.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {

  @Value("${spring.application.name}")
  private String nameApplication;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public @ResponseBody String getApplicationName() {
    return nameApplication;
  }

}
