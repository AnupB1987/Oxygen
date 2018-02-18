package corp.telecomservice.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import corp.telecomservice.controller.WelcomeController;

@Service
public class WelcomeService {
	private static final Logger LOGGER = Logger.getLogger(WelcomeController.class);

	public String getWelcomePage() {
		LOGGER.info("Welcome to WelcomeService");
		return "welcome";
	}
}
