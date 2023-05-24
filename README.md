# Hibernate-JPA-CRUD
Spring Boot with JPA and Spring Data JPA (with full database CRUD real-time project)
------
1) I am using java 8
2) My program is Working with JPA , if you want it to work with hibernate , all you have to do is to go to (  EmployeeServiceImpl.java  ) and change in line 22
3) @Qualifier("employeeDAOJpaImpl") to @Qualifier("employeeDAOHibernateImpl")
4) You will have to change DB credentials to yours , after executing the SQL Script 
5) use Postman or whatever you like to use  (get/put/delete)
