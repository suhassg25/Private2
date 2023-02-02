package com.ty.sdb;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mysql.cj.jdbc.Driver;

public class Fetch {

		public static void main(String[] args) {
			
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("student");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter id");
			int id=scanner.nextInt();
			
			
			Student student = entityManager.find(Student.class, id);
			System.out.println(student.getIdentityNumber()+"  "+student.getName()+"  "+student.getAddress()+"  "+student.getPhone()+"  "+student.getFather_name()+"  "+student.getMother_name());

		}

	}

