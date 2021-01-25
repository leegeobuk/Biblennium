package com.biblennium.bible;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BibleApplication {

	private static final String CONFIG_LOCATION = "spring.config.location=" +
			"classpath:/application.yml," +
			"classpath:/application-dev.yml," +
			"classpath:/application-prod.yml";

	public static void main(String[] args) {
		new SpringApplicationBuilder(BibleApplication.class)
			.properties(CONFIG_LOCATION)
			.run(args);
	}

}
