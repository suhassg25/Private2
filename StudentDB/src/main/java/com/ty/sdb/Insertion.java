package com.ty.sdb;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insertion {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("student");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Scanner sc=new Scanner(System.in);
		Student student=new Student();
		System.out.println("Enter Name of Student");
		String name=sc.nextLine();
		name+=sc.nextLine();
		student.setName(name);
		
		System.out.println("Enter Address of student");
		String address=sc.nextLine();
		address+=sc.nextLine();
		student.setAddress(address);
		System.out.println("Enter phone number");
		long phone=sc.nextLong();
		student.setPhone(phone);
		System.out.println("Enter PinCode");
		int pincode=sc.nextInt();
		student.setPincode(pincode);
		System.out.println("Enter Father's name");
		String f_name=sc.nextLine();
		f_name+=sc.nextLine();
		student.setFather_name(f_name);
		System.out.println("Enter Mother's name");
		String m_name=sc.nextLine();
		m_name+=sc.nextLine();
		student.setMother_name(m_name);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		
		System.out.println("Inserted");
	}

}
