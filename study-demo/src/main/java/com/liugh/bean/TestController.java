package com.liugh.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lgy
 * @desc 测试controler
 * @date 2019-11-11
 */
@RequestMapping("test")
@RestController
public class TestController {
    @Autowired
    private ApplicationService applicationService;
    @RequestMapping("test-001")
    public String test(){
        applicationService.mockedClient();
        return "test api";
    }
}
