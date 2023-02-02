package com.ty.sdb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Fetchall {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("student");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query quaery=entityManager.createQuery("SELECT s FROM Student s");
		List<Student> students=quaery.getResultList();
		
		for(Student s : students)
		{
			System.out.println(s);
		}
		

	}

}
