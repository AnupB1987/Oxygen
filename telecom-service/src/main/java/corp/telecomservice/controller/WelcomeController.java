package corp.telecomservice.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import corp.telecomservice.service.WelcomeService;

@Controller
public class WelcomeController {

	@Autowired
	private WelcomeService WelcomeService;
	private static final Logger LOGGER = Logger.getLogger(WelcomeController.class);

	@RequestMapping("/welcome")
	public String getModel() {
		LOGGER.info("Welcome to WelcomeController");
		return WelcomeService.getWelcomePage();
	}
}
