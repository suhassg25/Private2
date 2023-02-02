package com.ty.onetomanybi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomanybi.dao.Shoppings;
import com.ty.onetomanybi.dto.Items;
import com.ty.onetomanybi.dto.Shoppingcart;

public class Controll {

	public static void main(String[] args) {
		
	Shoppingcart shoppingcart=new Shoppingcart();
	shoppingcart.setName("Suhas S G");
	shoppingcart.setEmail("Suhas@gmail.com");
	shoppingcart.setAddress("Banglore");
	
	Items i1=new Items();
	i1.setName("Asus ROG");
	i1.setPrice(56000);
	i1.setManufacture("ASUS");
	i1.setCart(shoppingcart);
	
	Items i2=new Items();
	i2.setName("Laptop");
	i2.setPrice(156000);
	i2.setManufacture("Lenova");
	i2.setCart(shoppingcart);
	
	Items i3=new Items();
	i3.setName("Bag");
	i3.setPrice(3000);
	i3.setManufacture("WIKI");
	i3.setCart(shoppingcart);
	
	List<Items> item = new ArrayList();
	item.add(i1);
	item.add(i2);
	item.add(i3);
	
	shoppingcart.setItem(item);
	
	Shoppings sc=new Shoppings();
	sc.saveCart(shoppingcart);
		
	}

}
