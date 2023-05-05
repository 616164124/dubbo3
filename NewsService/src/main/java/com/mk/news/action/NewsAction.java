package com.mk.news.action;

import cn.hutool.core.lang.Snowflake;
import com.mk.mkcommon.User;
import com.mk.news.service.NewsService;
import com.mk.result.BaseBean;
import com.mk.result.WebResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class NewsAction {

    @Resource
    private NewsService newsService;

    @RequestMapping(value = "/dubbo3/news/01",method = RequestMethod.GET)
    public WebResult test01(){
        WebResult webResult = newsService.news01();
        return webResult;
    }


    @RequestMapping(value = "/dubbo3/news/02",method = RequestMethod.GET)
    public WebResult test02(){
        User user = new User();
        user.setId(new Snowflake().nextIdStr());
        BaseBean baseBean = new BaseBean();
        baseBean.setObject(user);
        baseBean.setType("NEWS02");
        WebResult webResult =newsService.news02(baseBean);
        return webResult;
    }

}
