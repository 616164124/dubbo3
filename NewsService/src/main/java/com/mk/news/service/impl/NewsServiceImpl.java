package com.mk.news.service.impl;

import com.mk.DubboService01;
import com.mk.DubboService02;
import com.mk.news.service.NewsService;
import com.mk.result.BaseBean;
import com.mk.result.WebResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@Service
@Slf4j
public class NewsServiceImpl implements NewsService {

    @Resource
    private ApplicationContext applicationContext;

    @DubboReference(retries = 1,timeout = 4_000,mock = "",loadbalance ="random" ,version = "1.0")
    private DubboService01 dubboService01;

    @DubboReference
    private DubboService02 dubboService02;

    @Override
    public WebResult news01() {
        BaseBean baseBean = new BaseBean();
        baseBean.setObject("");
        baseBean.setType(""+ UUID.randomUUID());
        log.info("dubboService01=========>前半部分");
        int port = ((ServletWebServerApplicationContext) applicationContext).getWebServer().getPort();
        log.info(" userService port :{}",port );
        WebResult webResult = dubboService01.dubboService01(baseBean);
        return webResult;
    }

    @Override
    public WebResult news02(BaseBean baseBean) {
        WebResult webResult = dubboService02.dubboService02(baseBean);
        return webResult;
    }
}
