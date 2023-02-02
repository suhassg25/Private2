package manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Manyins {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manytoone");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Office office=new Office();
		office.setName("Test Yantra");
		office.setAddress("Katriguppe cross");
		
		Employee e1 = new Employee();
		e1.setName("Suhas");
		e1.setLocation("Banglore");
		e1.setDesination("Software developer");
		e1.setOffice(office);
		

		Employee e2 = new Employee();
		e2.setName("Tarun");
		e2.setLocation("Chennai");
		e2.setDesination("Software developer");
		e2.setOffice(office);
		

		Employee e3 = new Employee();
		e3.setName("Manoj");
		e3.setLocation("Pune");
		e3.setDesination("Software developer");
		e3.setOffice(office);
		
		entityTransaction.begin();
		
		entityManager.persist(office);
		entityManager.persist(e1);
		entityManager.persist(e2);
		entityManager.persist(e3);
		
		entityTransaction.commit();
		
		
	}

}
