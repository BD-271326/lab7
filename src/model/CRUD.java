package model;


public class CRUD {

	public static void main(String[] args) {
		
		EmployeeCRUD employeeCRUD=new EmployeeCRUD();
		Employee employee=new Employee();
		int employeeId=150;
		//employeeCRUD.createEmployee(employee);
		
		employeeCRUD.readEmployee(employeeId);
		employeeCRUD.updateSalary(employeeId);
		employeeCRUD.readEmployee(employeeId);
		//employeeCRUD.deleteEmployee(employeeId);
	}
}
