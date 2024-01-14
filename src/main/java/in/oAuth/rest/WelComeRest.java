package in.oAuth.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelComeRest {

	@GetMapping("/")
	public String welcomeMsg() {
		
		return "Welcome to OAuth!...";
	}
}
