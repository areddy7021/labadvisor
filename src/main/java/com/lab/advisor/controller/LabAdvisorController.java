/**
 * @author akhil
 * 
 */
package com.lab.advisor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lab.advisor.service.LabAdvisorService;

@Controller
public class LabAdvisorController {

	private static final Logger logger = LoggerFactory.getLogger(LabAdvisorController.class);
	
	@Autowired
	private LabAdvisorService labAdvisorService;

	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView welcome(@PathVariable("name") String name) {

		logger.debug("welcome() - name {}", name);
        
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		model.addObject("name", labAdvisorService.getContent());

		return model;

	}

}
