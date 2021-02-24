package com.raymon.springboot_log.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created in 2021/2/24 17:23 @Author: Lin.Shi
 *
 * @version: 1.0 @Description:
 */
@Controller
public class HelloController {

  @GetMapping("/hello")
  public ModelAndView hello() {
    System.out.println("进入后台");
    ModelAndView mv =  new ModelAndView("thymeleaf/index");
    return mv;
  }
}