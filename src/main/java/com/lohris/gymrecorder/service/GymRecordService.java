package com.lohris.gymrecorder.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class GymRecordService {

	private static final Logger logger = LogManager.getLogger(GymRecordService.class);

	public String getDesc() {

		logger.debug("getDesc() is executed!");

		return "Gradle + Spring MVC Hello World Example";

	}

	public String getTitle(String name) {

		logger.debug("getTitle() is executed! $name : {}", name);

		if (StringUtils.isEmpty(name)) {
			return "Hello World";
		} else {
			return "Hello " + name;
		}

	}

}