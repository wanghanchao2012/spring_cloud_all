package com.hc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hc.client.EurekaClientFeign;

@Service
public class HiService {

    @Autowired
    EurekaClientFeign eurekaClientFeign;
    public String sayHi(String name){
        return  eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
