package model;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

public class CRUD {

	public static void main(String[] args) {
		
		EmployeeCRUD employeeCRUD=new EmployeeCRUD();
		Employee employee=new Employee();
		int employeeId=201;
		employee=setTestEmployee(employee);
		//employeeCRUD.createEmployee(employee);
		
		employeeCRUD.readEmployee(employeeId);
		employeeCRUD.updateSalary(employeeId);
		employeeCRUD.readEmployee(employeeId);
	//employeeCRUD.deleteEmployee(employeeId);
	}


	private static Employee setTestEmployee(Employee emp) 
	{
		emp.setEmployeeId(new BigDecimal(200));
		emp.setDepartmentId(new BigDecimal(1));
		emp.setCommissionPct(new BigDecimal(1));
		emp.setManagerId(new BigDecimal(1));
		emp.setSalary(new BigDecimal(1));
		emp.setEmail("TEST");
		emp.setFirstName("TEST");
		emp.setLastName("TEST");
		emp.setJobId("TEST");
		
		
		java.util.Date date=new java.util.Date();
		
		emp.setHireDate(date);
		emp.setPhoneNumber("TEST");
		return emp;
	}
}
