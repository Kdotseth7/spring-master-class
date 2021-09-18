package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		// Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		PersonDao personDao = applicationContext.getBean(PersonDao.class);
		System.out.println(personDao);
		PersonDao personDao2 = applicationContext.getBean(PersonDao.class);
		System.out.println(personDao2);

		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		LOGGER.info("{}", personDao.getJdbcConnection());

		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
	}

}