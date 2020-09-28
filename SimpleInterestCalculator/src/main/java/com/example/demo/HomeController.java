package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
		private double interest;
		
		@RequestMapping("home")
		public ModelAndView home(InterestInfo intInfo) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("home.jsp");
			
			return mv;
		}
		
		@RequestMapping("/newHome")
		public ModelAndView newHome(InterestInfo intInfo) {
			ModelAndView mv = new ModelAndView();
			int principalAmt = intInfo.getPrincipalAmt();
			int duration = intInfo.getDuration();
			double rate = intInfo.getRate();
			
			interest = (principalAmt*rate*duration)/100; 
			 
			mv.addObject("interest", interest);
			mv.setViewName("newHome.jsp");
			
			return mv;
		}
		
		
}
