package com.crpc.demo;

/**
 * 数据服务
 *
 * @author cong
 * @date 2024/02/02
 */
public interface DataService {

    /**
     * 发送数据
     * @param msg 内容
     * @return 服务端消息
     */
    String sendData(String msg);
}