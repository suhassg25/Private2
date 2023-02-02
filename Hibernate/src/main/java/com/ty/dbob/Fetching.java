package com.ty.dbob;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dbo.Employeedb;



public class Fetching {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query= entityManager.createQuery("SELECT e FROM Employeedb e");
		List<Employeedb> employee = query.getResultList();
		for(Employeedb e: employee)
		{
			System.out.println(e);
		}
	}

}
