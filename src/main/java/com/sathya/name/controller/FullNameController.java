package com.sathya.name.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FullNameController 
{

	@RequestMapping("/name")
	
	public String fullnameform()
	{
		return "name";
	}
	
	
	
}
