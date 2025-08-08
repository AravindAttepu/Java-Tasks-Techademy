package lab4_5;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lab4_5.bean.Employee;
import lab4_5.exception.EmployeeSalaryException;
import lab4_5.pl.EmployeeServiceImplementation;
import lab4_5.service.EmployeeService;

public class lab4_5 {

	public static void main(String[] args) throws EmployeeSalaryException{
		// TODO Auto-generated method stub
		
		EmployeeServiceImplementation esi= new EmployeeServiceImplementation();
		try
		{
		esi.addEmployee(new  Employee(101, "Aravind", 100000, "Tester"));
		esi.addEmployee(new  Employee(102, "Aravind", 100000, "Tester"));
		esi.addEmployee(new  Employee(103, "Aravind", 100000, "Tester"));
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		try {
			
		for(Employee e: esi.getEmployees().values())
		{
		String a=(esi.setInsuranceScheme(e));
		e.setInsuranceSchemeString(a);
		esi.addEmployee(e);

		}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		esi.deleteEmp(101);
		
		
		for(Employee e: esi.getEmployees().values())
		{
			System.out.println(e);
		}
	}
}

