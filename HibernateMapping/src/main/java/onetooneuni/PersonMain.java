package onetooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("uni");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		PanCard pan=new PanCard();
		Person person=new Person();
				
		
		System.out.println("Enter name");
		String name=scanner.next();
		pan.setName(name);
		
		System.out.println("enter Pan Number");
		String pan_number=scanner.next();
		pan.setPan_number(pan_number);
		
		
		person.setName(name);
		
		System.out.println("Enter age");
		int age=scanner.nextInt();
		person.setAge(age);
		
		System.out.println("Enter gender");
		String gender=scanner.next();
		person.setGender(gender);
		
		person.setCard(pan);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		
		entityTransaction.commit();
		System.out.println("Saved to Data Base");
	}

}
