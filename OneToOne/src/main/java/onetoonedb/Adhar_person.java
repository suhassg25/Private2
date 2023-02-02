package onetoonedb;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Adhar_person {

	public static void main(String[] args) {
		Person person=new Person();
		AdharCard adharCard=new AdharCard();
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("oneone");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Scanner s=new Scanner(System.in);
		
		
		
		System.out.println("Enter name of Person");
		String name=s.next();
		person.setName(name);
		adharCard.setName(name);
		System.out.println("Enter address of "+name);
		String address=s.next();
		person.setAddress(address);
		adharCard.setAddress(address);
		System.out.println("Enter age of "+name);
		int age=s.nextInt();
		person.setAge(age);
		adharCard.setAge(age);
		System.out.println("Enter adhar number");
		long adhar_num=s.nextLong();
		adharCard.setAdhar_num(adhar_num);
		System.out.println("Enter gender of "+name);
		String gender=s.next();
		person.setGender(gender);
		
		person.setAdhar(adharCard);
		
		entityTransaction.begin();
		entityManager.persist(adharCard);
		entityManager.persist(person);
		entityTransaction.commit();
		
	}

}
