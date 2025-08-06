import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

public class lab2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class EmployeeServiceImpl implements EmployeeService {

    @Override 
    public String setInsuranceScheme(Employee emp) {
        double salary = emp.getSalary();
        String designation = emp.getDesignation().toLowerCase();

        if (salary >= 50000 && designation.equals("manager")) {
            return "Scheme A";
        } else if (salary >= 20000 && salary < 50000 && designation.equals("programmer")) {
            return "Scheme B";
        } else if (salary >= 5000 && salary < 20000 && designation.equals("clerk")) {
            return "Scheme C";
        } else {
            return "No Scheme";
        }
    }


}
