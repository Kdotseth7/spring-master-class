package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.componentscan.ComponentDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
		// Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class,
				args);
		ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);

		LOGGER.info("{}", componentDao);
		LOGGER.info("{}", componentDao.getJdbcConnection());
	}

}