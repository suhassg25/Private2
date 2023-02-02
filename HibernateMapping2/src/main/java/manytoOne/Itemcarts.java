package manytoOne;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Itemcarts {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("many");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Cart cart = new Cart();
		cart.setName("Suhas");
		cart.setEmail("suhas@mail.com");
		cart.setAddress("Banglore");
		
		
		
		Item i1 = new Item();
		i1.setName("Duster");
		i1.setPrice(50);
		i1.setManufacture("Domes");
		i1.setCart(cart);
		
		Item i2=new Item();
		i2.setName("Pen");
		i2.setPrice(200);
		i2.setManufacture("Parker");
		i2.setCart(cart);
		
		
		entityTransaction.begin();
		entityManager.persist(cart);
		entityManager.persist(i1);
		entityManager.persist(i2);
		
		entityTransaction.commit();
	}
}
