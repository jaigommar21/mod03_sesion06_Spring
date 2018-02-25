package com.tecsup.gestion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.tecsup.gestion.dao.EmployeeDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.LoginException;
import com.tecsup.gestion.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	
	@Override
	public Employee findEmployeeByLogin(String login) {
		// TODO Auto-generated method stub
		Employee em = employeeDAO.findEmployeeByLogin(login);
		return em;
	}

}
