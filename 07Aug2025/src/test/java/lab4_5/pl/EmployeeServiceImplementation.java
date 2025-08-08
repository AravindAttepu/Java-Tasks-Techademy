package lab4_5.pl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import lab4_5.bean.Employee;
import lab4_5.exception.EmployeeSalaryException;

import lab4_5.service.EmployeeService;

public class EmployeeServiceImplementation implements EmployeeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

		HashMap<Integer,Employee> list = new HashMap<Integer,Employee>();

		public void addEmployee(Employee emp)
		{
			list.put(emp.getId(), emp);
		}
		public HashMap<Integer, Employee> getEmployees(){
		return list;
		}
	
	@Override
	public String setInsuranceScheme(Employee emp) {
		// TODO Auto-generated method stub
		if(emp.getDesignation() =="Manager") {
			return "A+";
		}
		else if(emp.getDesignation() == "Developer")
		{
			return "B+";
		}
		else if(emp.getDesignation() == "Tester") {
			return "A++";
		}
		else {
			{
				return "O+";
			}
		}
	}
	public void deleteEmp(int i) {
		// TODO Auto-generated method stub
		list.remove(i);
		
	}

}
