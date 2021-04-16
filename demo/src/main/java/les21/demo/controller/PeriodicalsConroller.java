package les21.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import les21.demo.domain.Periodical;
import les21.demo.service.PeriodicalsService;

@RestController
public class PeriodicalsConroller {

	@Autowired
	PeriodicalsService periodicalService;
	
	@RequestMapping(value ="/addPeriodical", method =RequestMethod.POST)
	public ModelAndView createPeriodical( @Valid @ModelAttribute("periodical")Periodical periodical, BindingResult bindResult){
		
		periodicalService.save(periodical);
		   
		return  new ModelAndView("redirect:/home");
		
	}
}
