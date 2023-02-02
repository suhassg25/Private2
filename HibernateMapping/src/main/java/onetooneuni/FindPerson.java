package onetooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

public class FindPerson {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uni");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("Enter id");
		int id = scanner.nextInt();

		// PanCard pan=entityManager.find(PanCard.class, id);
		Person person = entityManager.find(Person.class, id);
		System.out.println(person);

	}

}
