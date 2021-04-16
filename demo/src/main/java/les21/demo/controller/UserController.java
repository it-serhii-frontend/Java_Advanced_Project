package les21.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import les21.demo.domain.Periodical;
import les21.demo.domain.User;
import les21.demo.service.PeriodicalsService;
import les21.demo.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private PeriodicalsService periodicalService;
	
	@RequestMapping("/welcome")
	public String welcomepage() {
		return "Welcome to Yawin Tutor";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration(Model model) {

		model.addAttribute("userForm", new User());

		return "registration";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return "registration";
		}
		userService.save(userForm);

		return "redirect:/home";
	}

	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
	public String login(Model model, String error, String logout) {

		if (error != null)
			model.addAttribute("error", "Your username and password is invalid");

		if (logout != null)
			model.addAttribute("message", "You have been logged out successfully");

		return "login";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView welcome() {
		
		ModelAndView map = new ModelAndView();
		map.addObject("periodials",periodicalService.getAllPeriodicals());
		
		return map;

	}
	@RequestMapping(value = "/create-periodical", method = RequestMethod.GET)
	public ModelAndView createPeriodical() {
		return new ModelAndView("createPeriodical", "periodical", new Periodical());

	}
}
