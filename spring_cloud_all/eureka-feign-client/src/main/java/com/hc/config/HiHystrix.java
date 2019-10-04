package com.hc.config;

import org.springframework.stereotype.Component;

import com.hc.client.EurekaClientFeign;

@Component
public class HiHystrix implements EurekaClientFeign {
	@Override
	public String sayHiFromClientEureka(String name) {
		return " hi ," + name + ", sorry , error !";
	}
}