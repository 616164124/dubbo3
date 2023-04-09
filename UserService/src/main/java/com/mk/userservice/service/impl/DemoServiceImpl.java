package com.mk.userservice.service.impl;

import com.mk.result.WebResult;
import com.mk.userservice.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public WebResult demo01() {
        log.info("DemoServiceImpl===============demo01");
        return null;
    }

    @Override
    public WebResult demo02() {
        log.info("DemoServiceImpl===============demo02");
        return null;
    }
}
