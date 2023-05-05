package com.mk.news.service;

import com.mk.result.BaseBean;
import com.mk.result.WebResult;

public interface NewsService {
    WebResult news01();
    WebResult news02(BaseBean baseBean);
}
