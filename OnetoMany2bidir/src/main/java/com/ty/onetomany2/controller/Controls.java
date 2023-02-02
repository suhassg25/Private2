package com.ty.onetomany2.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.boot.jaxb.mapping.spi.EntityOrMappedSuperclass;

import com.ty.onetomany2.dto.Phone;
import com.ty.onetomany2.dto.Sim;

public class Controls {
	public void save(Phone phone) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ONEM");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(phone);
		for (Sim s : phone.getSim()) {
			entityManager.persist(s);
		}

		entityTransaction.commit();
	}
}
