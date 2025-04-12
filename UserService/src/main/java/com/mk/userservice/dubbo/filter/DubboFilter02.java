package com.mk.userservice.dubbo.filter;

import org.apache.dubbo.rpc.*;

/**
 * @author
 * @version 1.0
 * @date 2025/4/12
 */


public class DubboFilter02 implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {


        // 判断当前接口是否为指定接口
        String targetServiceUniqueName = invocation.getTargetServiceUniqueName();
        String methodName = invocation.getMethodName();
        System.out.println(methodName+"=======DubboFilter02==============="+targetServiceUniqueName);
        if (targetServiceUniqueName.contains("com.mk.DubboService01")) {
            // 如果是目标接口，执行过滤逻辑
            System.out.println("Filter applied to DemoService");
            return invoker.invoke(invocation);
        }


        return invoker.invoke(invocation);
    }

}
