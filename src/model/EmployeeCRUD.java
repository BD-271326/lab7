package model;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeCRUD {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	EmployeeCRUD(){
		entityManagerFactory=Persistence.createEntityManagerFactory("FirstJPA");
	}
	
	public void createEmployee(Employee employee) {
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	@Override
	public void finalize() {
		entityManagerFactory.close();
	}

	public void readEmployee(int id) {
		entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class,new BigDecimal(id));
		System.out.print(employee.getEmployeeId() + " " + employee.getLastName()+ " " +employee.getSalary() + "\n");
		entityManager.close();
	}

	public void updateSalary(int id) {
		entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class,new BigDecimal(id));
		employee.setSalary(employee.getSalary().multiply(new BigDecimal(1.1)));
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void deleteEmployee(int id) {
		entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class,new BigDecimal(id));
		entityManager.getTransaction().begin();
		entityManager.remove(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}
}
