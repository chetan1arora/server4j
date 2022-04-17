package com.example.server.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class MainRouter extends RouteBuilder{
	
	
	@Override
	public void configure() throws Exception {

		restConfiguration()
		.component("servlet")
		.host("localhost")
		.port(8081);
		
		rest("/ping")
		.get()
		.route()
		.transform().constant("pong!!");

	}
	
}
