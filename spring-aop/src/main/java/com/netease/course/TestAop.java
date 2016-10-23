package com.netease.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		AdoService as = context.getBean("adoService", AdoService.class);
		as.insert(1, 1);
		as.update(5, 2);
		
		((ConfigurableApplicationContext)context).close();

	}

}
