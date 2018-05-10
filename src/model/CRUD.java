package model;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CRUD {

	public static void main(String[] args) {
		
		EmployeeCRUD employeeCRUD=new EmployeeCRUD();
		Employee employee=new Employee();
		int employeeId=2001;
		employee=setTestEmployee(employee);
		employeeCRUD.createEmployee(employee);
		
		employeeCRUD.readEmployee(employeeId);
		employeeCRUD.updateSalary(employeeId);
		employeeCRUD.readEmployee(employeeId);
	employeeCRUD.deleteEmployee(employeeId);
	}


	private static Employee setTestEmployee(Employee emp) 
	{
		emp.setEmployeeId(new BigDecimal(2001));
		emp.setDepartmentId(new BigDecimal(60));
		emp.setManagerId(new BigDecimal(108));
		emp.setSalary(new BigDecimal(1000));
		emp.setEmail("TEST");
		emp.setFirstName("TEST");
		emp.setLastName("TEST");
		emp.setJobId("TEST");
		emp.setHireDate(new Date(2018,5,7));
		emp.setPhoneNumber("TEST");
		return emp;
	}
}
