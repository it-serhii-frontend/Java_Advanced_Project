package les21.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@GetMapping("/")
	public String homePage(Model model) {
		return "home";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
