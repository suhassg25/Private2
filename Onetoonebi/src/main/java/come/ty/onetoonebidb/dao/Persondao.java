package come.ty.onetoonebidb.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import come.ty.onetoonebidb.dto.*;

public class Persondao {
	
	public void savePerson(Person person)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("onebi");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		PanCard pancard=person.getPancard();
		entityTransaction.begin();
		
		entityManager.persist(pancard);
		entityManager.persist(person);
		
		entityTransaction.commit();
	}
public Person fetchPerson(int id)
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("onebi");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	Person person=entityManager.find(Person.class, id);
return person;
	
}
public PanCard fetchPan(int id)
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("onebi");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	PanCard pan=entityManager.find(PanCard.class, id);
return pan;
	
}
}
