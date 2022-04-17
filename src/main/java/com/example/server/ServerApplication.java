package com.example.server;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
//import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
@EnableDiscoveryClient
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);		
	}

	
	 @Bean
	 public ServletRegistrationBean<CamelHttpTransportServlet> servletRegistrationBean() {
	 ServletRegistrationBean<CamelHttpTransportServlet> registration = new
	 ServletRegistrationBean<CamelHttpTransportServlet>(new
	 CamelHttpTransportServlet(), "/camel/*"); registration.setName("CamelServlet");
	return registration; }
	
}
