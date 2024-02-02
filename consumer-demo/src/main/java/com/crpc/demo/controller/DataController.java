package com.crpc.demo.controller;

import com.crpc.demo.DataService;
import com.crpc.starter.common.CRpcReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 数据控制者
 *
 * @author cong
 * @date 2024/02/02
 */
@RestController
@RequestMapping(value = "/data")
public class DataController {

    @CRpcReference
    private DataService dataService;

    @GetMapping(value = "/send/{msg}")
    public String sendMsg(@PathVariable(name = "msg") String msg){
        return dataService.sendData(msg);
    }
}