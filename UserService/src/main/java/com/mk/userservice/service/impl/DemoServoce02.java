package com.mk.userservice.service.impl;

import com.mk.DubboService02;
import com.mk.result.BaseBean;
import com.mk.result.WebResult;
import javafx.application.Application;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

@Slf4j
@DubboService
public class DemoServoce02 implements DubboService02 {



    @Resource
    private ApplicationContext applicationContext;

    @Override
    public WebResult dubboService02(BaseBean bean) {
        WebResult webResult = new WebResult();


        //根据basebean中的type来选择不同的方法（策略模式）
        webResult.setCode("00000");
        webResult.setMsg("hfuewhlkfshfu");
        return webResult;
    }

}
