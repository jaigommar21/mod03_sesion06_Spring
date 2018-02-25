package com.tecsup.gestion.dao;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.exception.LoginException;
import com.tecsup.gestion.model.Employee;

public interface EmployeeDAO {

	
	Employee validate(String idEmployee, String clave) throws LoginException, DAOException;

	Employee findEmployeeByLogin(String login);

}

