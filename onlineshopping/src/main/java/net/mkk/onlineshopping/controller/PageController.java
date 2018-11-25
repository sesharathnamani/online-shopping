package net.mkk.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting","Welcome to Spring Web MVC");
		return mv;
	}
	
	
	@RequestMapping(value= {"default"})
	public ModelAndView common() {
		
		ModelAndView mv1=new ModelAndView("page");
		mv1.addObject("Hello","Hello to Sring MVC");
		return mv1;
	}

}