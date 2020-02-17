package com.fdx.rtct.configModule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
@ComponentScan("com.fdx.rtct.configModule")
@RequestMapping
public class ConfigServerApplication {
	
	public static void main(String[] args) {
		System.out.println("--allocation started-----");
		SpringApplication.run(ConfigServerApplication.class, args);
	}
	
	@RequestMapping(path = "/method2" , method = RequestMethod.GET )
	public String method(){
		return "Config Test Controller 2";
		
	}
	
	
}
