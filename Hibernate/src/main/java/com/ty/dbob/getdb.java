package com.ty.dbob;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dbo.Employeedb;

public class getdb {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
			Employeedb employee= entityManager.find(Employeedb.class, 1 );
			
			System.out.println(employee.getIdno()+"  "+employee.getName()+"  "+employee.getPhone_number());

		
		
	}

}
