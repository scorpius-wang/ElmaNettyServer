package com.wangwei.netty.controller;


import com.wangwei.netty.client.NettyClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Contended;

@Controller
public class TestController {
    @Autowired
    private NettyClientService clientService;

    @RequestMapping(value = "/test", method = {RequestMethod.POST})
    @ResponseBody
    public String sendSyncMsg(String dataId, String text) {
        String serviceId = "mmmm";
        String result = clientService.sendSyncMsg(text, dataId, serviceId);
        return "result:" + result;
    }

}
