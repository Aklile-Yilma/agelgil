package com.agelgil.agelgil.lib.view;


import com.agelgil.agelgil.lib.data.repositories.webcontent.ContactInformationRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;


public class AgelgilController {
	
	@Autowired
	private ContactInformationRespository contactInformationRespository;


	@ModelAttribute
	public void setupModelMap(ModelMap modelMap){
		modelMap.addAttribute(
			"contactInformations", contactInformationRespository.findAll()
		);
	}

}
