package com.ty.manytomanybi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytomanybi.dto.Course;
import com.ty.manytomanybi.dto.Student;

public class Controls {
	public static void main(String[] args) {
		
		Student s1= new Student();
		s1.setId(1);
		s1.setName("Suhas");
		s1.setNumber(12345);
		
		Student s2= new Student();
		s2.setId(2);
		s2.setName("Tarun");
		s2.setNumber(89279);
		
		Student s3= new Student();
		s3.setId(3);
		s3.setName("Manoj");
		s3.setNumber(9878324);
		
		Course c1=new Course();
		c1.setId(101);
		c1.setName("Java");
		
		Course c2=new Course();
		c2.setId(102);
		c2.setName("Adv java");
		
		Course c3=new Course();
		c3.setId(103);
		c3.setName("HTML");
		
		List<Course> course1=new ArrayList();
		course1.add(c1);
		course1.add(c3);
		s1.setCourse(course1);
		
		List<Course> course2=new ArrayList();
		course2.add(c2);
		course2.add(c3);
		s2.setCourse(course2);
		
		List<Course> course3=new ArrayList();
		course3.add(c1);
		course3.add(c2);
		s3.setCourse(course3);
		
		List<Student> student1 = new ArrayList();
		student1.add(s1);
		student1.add(s3);
		c1.setStudents(student1);
		
		
		List<Student> student2 = new ArrayList();
		student2.add(s2);
		student2.add(s3);
		c2.setStudents(student2);
		
		List<Student> student3 = new ArrayList();
		student3.add(s1);
		student3.add(s2);
		c3.setStudents(student3);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("many2many");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(s3);
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(c3);
		
		
		
		entityTransaction.commit();
		
		
		
	}

}
