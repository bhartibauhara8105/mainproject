package com.niit.jobmanagement.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.jobmanagement.entities.Jobs;
import com.niit.jobmanagement.entities.User;
import com.niit.jobmanagement.repos.JobsRepository;
import com.niit.jobmanagement.repos.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	JobsRepository jobRepository;
	
	@RequestMapping("/showReg") 
	public String showRegisterationPage()
	{
		System.out.println(" %%%%%%%%%%%%%%%%  showing register");
		return "login/registerUser";
	}
	
	
	
	@RequestMapping("/showLogin") 
	public String showLoginPage()
	{
		System.out.println(" %%%%%%%%%%%%%%%%  showing login");
		return "login/login";
	}
	
	
	@RequestMapping(value="/registerUser",method=RequestMethod.POST)
	public String register(@ModelAttribute("user") User user)
	{
		userRepository.save(user);
		
		return"login/login";
	}
	
	
	//@RequestMapping(value="/login",method=RequestMethod.POST)
	@RequestMapping("/login") 
	public String login(@RequestParam("email")String email,@RequestParam("password")String password,ModelMap modelMap,HttpSession session)
	{
		System.out.println("in login module");
		
		User user=userRepository.findByEmail(email);
		if(user==null) {
			modelMap.addAttribute("msg", "Invalid username or password.Please try again...");
			return"login/login";
		}
		else {
			
		System.out.println("user "+user);
		System.out.println("***********************************************    "+user.getPassword()+"    "+password);
		
		if(user.getPassword().equals(password))
		{
			if(user.getRole().equals("Job Seeker"))
			{
				
				session.setAttribute("username", email);
				List<Jobs> jobs=jobRepository.findAll();
				
				
				System.out.println("jobbbsss "+jobs.get(0).getCategory());
				
				 modelMap.put("jobs", jobs);
				
				return "login/userModule";
			}
			else {
				return "hrModule";
			}
			
		}
		else {
			modelMap.addAttribute("msg", "Invalid username or password.Please try again...");
		
		}
		
		return"login/login";
	}
	
	}
	
	
	
}
