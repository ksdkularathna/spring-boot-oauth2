package com.spring_oauth2.spring_oauth2;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController
{
  @GetMapping("/")
  public String greet()
  {
    return "Welcome to the home page!";
  }

  @GetMapping("/data")
  public String getData()
  {
    return "Secured data";
  }
}
