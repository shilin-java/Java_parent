package com.raymon.springboot_log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created in       2021/2/24 13:26
 *
 * @Author: Lin.Shi
 * @version: 1.0
 * @Description:
 */
@RestController
@RequestMapping("/index")
public class LogController {
    private static final Logger LOG = LoggerFactory.getLogger(LogController.class);
    @GetMapping("/log")
    public void list()
    {
      LOG.error("访问出现错误");
    }
}
