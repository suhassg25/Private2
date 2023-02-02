package com.ty.dbo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Establish {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ID");
		int id=scanner.nextInt();
		System.out.println("Enter name");
		String name=scanner.next();
		System.out.println("Enter phone");
		long phone=scanner.nextLong();
		
		Employeedb e=new Employeedb();
		e.setIdno(id);
		e.setName(name);
		e.setPhone_number(phone);
		
		entityTransaction.begin();
		entityManager.persist(e);
		entityTransaction.commit();
		
		
		System.out.println("created");
	}

}
