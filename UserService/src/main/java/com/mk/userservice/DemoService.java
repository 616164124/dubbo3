package com.mk.userservice;

import com.mk.DubboService01;
import com.mk.result.BaseBean;
import com.mk.result.WebResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;


@DubboService
@Slf4j
public class DemoService implements DubboService01 {

    private com.mk.userservice.service.DemoService demoService;

    public DemoService(com.mk.userservice.service.DemoService demoService) {
        this.demoService = demoService;
    }

    @Override
    public WebResult dubboService01(BaseBean bean) {
        log.info("userService dubboService01");
        demoService.demo01();
        return new WebResult("成功！！！");
    }

    public com.mk.userservice.service.DemoService getDemoService() {
        return demoService;
    }
}
