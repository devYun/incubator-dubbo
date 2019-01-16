package org.apache.dubbo.demo.consumer;


import org.apache.dubbo.demo.DemoService;
import org.apache.dubbo.rpc.RpcContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author luozhiyun on 2018-12-09.
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello ++++" + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
