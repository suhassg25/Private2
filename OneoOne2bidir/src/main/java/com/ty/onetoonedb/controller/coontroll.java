package com.ty.onetoonedb.controller;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonedb.dbo.AdharCard;
import com.ty.onetoonedb.dbo.Person;

public class coontroll {
	public void saveAdhar(AdharCard adhar) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ONE");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(adhar);
		Person p = adhar.getPerson();
		entityManager.persist(p);

		entityTransaction.commit();
	}

}
