package lab4_5.service;

import java.util.HashMap;

import lab4_5.bean.Employee;

public interface EmployeeService {

	String setInsuranceScheme(Employee emp);

	HashMap<Integer,Employee> getEmployees();

	

}


