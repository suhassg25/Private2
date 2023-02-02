package com.ty.studentservlet.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.studentservlet.dto.Studentdto;

public class Studentdao {
	public void save(Studentdto student)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("one");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
	
	public Studentdto getSTudent (String email)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("one");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("Select a from Student a WHERE a.email=?1", Studentdto.class);
		Studentdto student= (Studentdto) query.getSingleResult();
		return student;
	}
	
	
	

}
