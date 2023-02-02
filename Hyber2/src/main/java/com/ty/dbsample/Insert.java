package com.ty.dbsample;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Insert {

	public static void main(String[] args) {
	
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		
	Query query=entityManager.createQuery("SELECT s FROM SUHAS s");
		List<Suhas> s =query.getResultList();
		System.out.println(s);
		
		
	}

}
