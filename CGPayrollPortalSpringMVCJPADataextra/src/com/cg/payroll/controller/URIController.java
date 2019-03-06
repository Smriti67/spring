package com.cg.payroll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.payroll.beans.Associate;

@Controller
public class URIController {

	private Associate associate;
	
	@RequestMapping(value= {"/", "index"})   //two names for 1 page
	public String getIndexPage() {
		return "indexPage" ;
	}
	
	@RequestMapping("/registration")
	public String getRegistrationPage() {
		return "registrationPage" ;
	}
	
	@RequestMapping("/findAssociateDetails")
	public String getFindAssociateDetailsPage() {
		return "findAssociateDetailsPage" ;
	}
	@RequestMapping("/calculateNetSalary")
	public String getcalculateNetSalaryPage() {
		return "calculateNetSalaryPage" ;
	}
	
	@ModelAttribute
	public Associate getAssociate() {
		associate = new Associate() ;
		return associate ;
	}
	
}