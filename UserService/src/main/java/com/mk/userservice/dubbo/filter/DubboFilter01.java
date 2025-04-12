package com.mk.userservice.dubbo.filter;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

import java.security.Provider;

import static org.apache.dubbo.common.constants.CommonConstants.PROVIDER;

/**
 * @author
 * @version 1.0
 * @date 2025/4/12
 */


//@Activate(group = PROVIDER)
public class DubboFilter01 implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {


        // 判断当前接口是否为指定接口
        String targetServiceUniqueName = invocation.getTargetServiceUniqueName();
        String methodName = invocation.getMethodName();
        System.out.println(methodName+"======================"+targetServiceUniqueName);
        if (targetServiceUniqueName.contains("com.mk.DubboService01")) {
            // 如果是目标接口，执行过滤逻辑
            System.out.println("Filter applied to DemoService");
            return invoker.invoke(invocation);
        }


        return invoker.invoke(invocation);
    }

}
