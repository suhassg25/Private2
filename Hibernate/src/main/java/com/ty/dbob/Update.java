package com.ty.dbob;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dbo.Employeedb;

public class Update {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employeedb emp = new Employeedb();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter phone");
		long phone=sc.nextLong();
		
		emp.setIdno(id);
		emp.setName(name);
		emp.setPhone_number(phone);
		
		entityTransaction.begin();
		entityManager.merge(emp);
		entityTransaction.commit();
		System.out.println("Updated succefully");
		
	}

}
