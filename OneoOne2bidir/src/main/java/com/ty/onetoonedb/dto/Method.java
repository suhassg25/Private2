package com.ty.onetoonedb.dto;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoonedb.controller.coontroll;
import com.ty.onetoonedb.dbo.AdharCard;
import com.ty.onetoonedb.dbo.Person;

public class Method {
	public static void main(String[] args) {

				
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter name of the person");
				String name1 = scanner.nextLine();
				name1 += scanner.nextLine();
				System.out.println("Enter address of person");
				String ad = scanner.nextLine();
				ad += scanner.nextLine();
				System.out.println("enter age");
				int age = scanner.nextInt();
				System.out.println("Enter adhar number");
				long adharnumber = scanner.nextLong();
		
				AdharCard adharCard = new AdharCard();
				adharCard.setName(name1);
				adharCard.setAddress(ad);
				adharCard.setAdharnumber(adharnumber);
		
				Person p = new Person();
				p.setName(name1);
				p.setAddress(adharCard.getAddress());
				p.setAge(age);
				p.setAdharcard(adharCard);
		
				adharCard.setPerson(p);
				coontroll coontroll = new coontroll();
				coontroll.saveAdhar(adharCard);

	}

}
