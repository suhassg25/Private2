package com.ty.db;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Create {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter phone number");
		long phone=sc.nextLong();
		
		Employee e1=new Employee();
		e1.setName(name);
		e1.setPhone(phone);
		
		entityTransaction.begin();
		entityManager.persist(e1);
		entityTransaction.commit();
		
	}

}
