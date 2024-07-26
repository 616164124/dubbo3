package com.mk.userservice.service.impl;

import com.mk.result.WebResult;
import com.mk.userservice.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private ApplicationContext applicationContext;

    @Override
    public WebResult demo01() {
        int port = ((ServletWebServerApplicationContext) applicationContext).getWebServer().getPort();
        log.info(" userService port :{}",port );

        log.info("DemoServiceImpl===============demo01");
        return new WebResult();
    }

    @Override
    public WebResult demo02() {
        log.info("DemoServiceImpl===============demo02");
        return null;
    }
}
