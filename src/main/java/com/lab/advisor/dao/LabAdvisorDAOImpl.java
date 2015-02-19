package com.lab.advisor.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LabAdvisorDAOImpl implements LabAdvisorDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(LabAdvisorDAOImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public String getContent() {
		 return this.jdbcTemplate.queryForObject("select name from mytable", String.class);
	}	

}
