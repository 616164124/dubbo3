package com.mk.news.action;

import com.mk.news.service.NewsService;
import com.mk.result.WebResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class NewsAction {

    @Resource
    private NewsService newsService;

    @RequestMapping("/dubbo3/news/01")
    public WebResult test01(){
        WebResult webResult = newsService.news01();
        return webResult;

    }

}
