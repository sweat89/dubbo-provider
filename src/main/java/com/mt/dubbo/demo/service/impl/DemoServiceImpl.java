package com.mt.dubbo.demo.service.impl;

import org.springframework.stereotype.Service;

import com.mt.dubbo.demo.dto.Person;
import com.mt.dubbo.demo.service.DemoService;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public String getPersonInfo(Person person) {
        return person.toString();
    }
}
