package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {

	@Autowired
	Bmi_check bic;
	
	@GetMapping("/bmicheck")
	public ModelAndView display() // localhost:8080/bmicheck
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home.jsp");
		return mav;
	}
	@GetMapping("/Calculate_bmi")
	public ModelAndView Calculate(BMI_Cal givebmi)
	{
		bic.save(givebmi);
		float Weight = givebmi.getWeight();
		float Height = givebmi.getHeight()/100;
		float BMI = Weight/(Height*Height);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("chagre", Weight);
		mav.addObject("chagre1", Height);
		mav.addObject("chagre2", BMI);
		
		
		if (BMI>=18.5 && BMI<=24.9)
		{
			
			
			mav.addObject("chagre3", "YOUR BMI IS HEALTHY RANGE");
			mav.setViewName("output.jsp");
			//mav.setViewName("error.jsp");
		}
		else
		{
			mav.addObject("error2", "YOUR BMI IS OBESE RANGE");
			mav.setViewName("error2.jsp");
		}
		return mav;
	}
}
