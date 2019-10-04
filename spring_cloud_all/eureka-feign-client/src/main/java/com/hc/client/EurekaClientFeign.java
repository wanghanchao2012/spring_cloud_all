package com.hc.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hc.config.FeignConfig;
import com.hc.config.HiHystrix;

@FeignClient(value = "eureka-client", configuration = FeignConfig.class, fallback = HiHystrix.class)
public interface EurekaClientFeign {
	@GetMapping(value = "/hi")
	String sayHiFromClientEureka(@RequestParam(value = "name") String name);
}
