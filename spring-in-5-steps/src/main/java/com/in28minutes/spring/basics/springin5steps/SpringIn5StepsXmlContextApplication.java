package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.scope.xml.XmlPersonDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringIn5StepsXmlContextApplication {

	public static void main(String[] args) {

		Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);

		// Application Context
		try (ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			XmlPersonDao xmlPersonDao = classPathXmlApplicationContext.getBean(XmlPersonDao.class);

			LOGGER.info("{}", xmlPersonDao);
			LOGGER.info("{}", xmlPersonDao.getXmlJdbcConnection());

			classPathXmlApplicationContext.close();
		}
	}

}