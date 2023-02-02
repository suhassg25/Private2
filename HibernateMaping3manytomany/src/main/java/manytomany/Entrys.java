package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Entrys {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manyone");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Course c1=new Course();
	c1.setCourse("JAVA");
	Course c2=new Course();
	c2.setCourse("ADV - JAVA");
	Course c3=new Course();
	c3.setCourse("HTML");
	
	Student s1=new Student();
	s1.setName("Darshan");
	s1.setPhone_number(89712791);
	
	List<Course> course1=new ArrayList<Course>();
	course1.add(c1);
	course1.add(c2);
	s1.setCourse(course1);
	
	Student s2=new Student();
	s2.setName("Vinay");
	s2.setPhone_number(967968);
	List<Course> course2=new ArrayList<Course>();
	course2.add(c2);
	course2.add(c3);
	s2.setCourse(course2);
	
	entityTransaction.begin();
	entityManager.persist(c1);
	entityManager.persist(c2);
	entityManager.persist(c3);
	entityManager.persist(s1);
	entityManager.persist(s2);
	
	entityTransaction.commit();
	
	
}
}
