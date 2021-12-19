package com.example.server.routes;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class MainRouter extends RouteBuilder{
	
	
	@Override
	public void configure() throws Exception {
		
		  
		
		restConfiguration()
		.component("servlet")
		.contextPath("/")
		.apiContextPath("/api-doc")
		.host("localhost")
		.port(8080);
		
		rest("/ping")
		.get()
		.produces(MediaType.TEXT_PLAIN_VALUE)
		.route()
		.transform().constant("pong!!");

	}
	
}
