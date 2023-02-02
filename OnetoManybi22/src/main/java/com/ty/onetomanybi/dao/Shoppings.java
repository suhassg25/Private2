package com.ty.onetomanybi.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomanybi.dto.Items;
import com.ty.onetomanybi.dto.Shoppingcart;

public class Shoppings {
	public void saveCart(Shoppingcart shopping)
	{
		


		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("12many");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(shopping);
		for(Items i : shopping.getItem())
		{
			entityManager.persist(i);
		}
		entityTransaction.commit();
		
			}
	

}
