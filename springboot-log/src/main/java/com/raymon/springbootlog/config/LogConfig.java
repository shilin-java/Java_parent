package com.raymon.springbootlog.config;

import com.raymon.springbootlog.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created in       2021/2/24 9:56
 *
 * @Author: Lin.Shi
 * @version: 1.0
 * @Description:
 */
@Configuration
public class LogConfig {
    private static final Logger LOG = LoggerFactory.getLogger(LogConfig.class);
    @Bean
    public Person logMethod() {
        LOG.info("==========print log==========");
        return new Person();
    }
}
