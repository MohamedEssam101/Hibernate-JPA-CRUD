package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOJpaImpl (EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	public List<Employee> findAll() {

		//create a query
		Query theQuery = 
				entityManager.createQuery("from Employee");
		
		//excute the query and get results
		List<Employee> employees = theQuery.getResultList();
		
		//return the results
		return employees;
	}

	@Override
	public Employee findById(int theId) {
		
		//get empolyee
		Employee theEmployee = 
				entityManager.find(Employee.class, theId);
		
		//return the employee
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {

		//save or update the employee
		Employee dbEmployee = entityManager.merge(theEmployee);
		
		//update with id from db ... so we can get generated id for save/insert
		
		//The id field is only assigned on the instance returned from the entityManager.merge(...). 
		//It does not perform assignment on the original object that you passed in. Hence we update the id of the original object using
		theEmployee.setId(dbEmployee.getId());

	}

	@Override
	public void deleteById(int theId) {

		//delete  object by primary key
		Query theQuery = entityManager.createQuery(
							"delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId",theId);
		
		theQuery.executeUpdate();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
