package com.ty.dbob;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dbo.Employeedb;



public class Delete {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employeedb e=entityManager.find(Employeedb.class, 1);
		
		entityTransaction.begin();
		entityManager.remove(e);
		entityTransaction.commit();
System.out.println("Deleted");
	}

}
