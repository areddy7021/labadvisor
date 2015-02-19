package com.lab.advisor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.advisor.dao.LabAdvisorDAO;

@Service
public class LabAdvisorServiceImpl implements LabAdvisorService {
	
	@Autowired
	private LabAdvisorDAO labAdvisorDAO;

	@Override
	public String getContent() {
		return labAdvisorDAO.getContent();
	}

}
