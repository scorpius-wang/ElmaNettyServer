package com.wangwei.netty.client;

/**
 * Created by wangwei on 19/10/27.
 */
public interface NettyClientService {
    boolean sendMsg(String text, String dataId, String serviceId);

    String sendSyncMsg(String text, String dataId, String serviceId);

    void ackSyncMsg(String msg);
}
