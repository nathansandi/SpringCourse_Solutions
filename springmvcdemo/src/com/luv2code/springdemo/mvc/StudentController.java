package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		
		//create a student object
		Student theStudent = new Student();
		
		//add student object to the model
		theModel.addAttribute("student",theStudent);
		
		return "student-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student theStudent,
								BindingResult theBindingResult) {
		
		//System.out.println("theStudent: "+theStudent.getFirstName());
		System.out.println("Last name -- "+theStudent.getLastName());
		System.out.println("Binding result: "+theBindingResult);
		System.out.println("\n\n\n");
		if(theBindingResult.hasErrors()) {
			return "student-form";
		}else {
			return "student-confirmation";
		}
		
	}
	//add initBinder para fazer pre validaçoes 
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmer);
	}
}
