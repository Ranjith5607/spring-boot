package com.employee.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.employee.interceptor.EmployeeInterceptor;

@Component
public class EmployeeInterceptorAppConfig extends WebMvcConfigurationSupport {

	@Autowired
	private EmployeeInterceptor employeeInterceptor;

	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		super.addInterceptors(registry);
		registry.addInterceptor(employeeInterceptor);
	}

}
