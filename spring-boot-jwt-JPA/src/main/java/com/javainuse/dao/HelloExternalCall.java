//package com.javainuse.dao;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@FeignClient(name = "WORLD-SERVICE")
//public interface HelloExternalCall {
//
//	@GetMapping("/hello")
//	public ResponseEntity<String> getWorld();
//}