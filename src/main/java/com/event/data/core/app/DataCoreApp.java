package com.event.data.core.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.event.data.core.config.DataCoreConfig;

public class DataCoreApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(DataCoreConfig.class);
		
	}
}
