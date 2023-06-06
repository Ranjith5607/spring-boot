//package com.javainuse.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import com.javainuse.dao.HelloExternalCall;
//
//@Service
//public class HelloService {
//
//	@Autowired
//	private HelloExternalCall helloExternalServiceCall;
//
//	public String firstPage() {
//
//		ResponseEntity<String> world = helloExternalServiceCall.getWorld();
//
//		String body = world.getBody();
//		return "";
//	}
//}
