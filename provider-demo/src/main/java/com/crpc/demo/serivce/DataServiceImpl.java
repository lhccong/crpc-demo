package com.crpc.demo.serivce;

import com.crpc.demo.DataService;
import com.crpc.starter.common.CRpcService;

/**
 * 数据服务实现
 *
 * @author cong
 * @date 2024/02/02
 */
@CRpcService
public class DataServiceImpl implements DataService {

    @Override
    public String sendData(String body) {
        System.out.println("这里是服务提供者，body is " + body);
        return "我是聪聪聪聪聪聪";
    }
}