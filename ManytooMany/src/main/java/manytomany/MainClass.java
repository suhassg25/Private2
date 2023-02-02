package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

public static void main(String...args){
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manyto");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student s1=new Student();
		s1.setName("Tarun");
		s1.setAddress("Banlore");
		s1.setStd(9);
		
		Student s2=new Student();
		s2.setName("manoj");
		s2.setAddress("Bagalkot");
		s2.setStd(10);
		
		Student s3=new Student();
		s3.setName("chandan");
		s3.setAddress("hkr");
		s3.setStd(11);
		
		Student s4=new Student();
		s4.setName("siddu");
		s4.setAddress("haveri");
		s4.setStd(2);
		
		List< Student> std1 = new ArrayList<Student>();
		std1.add(s2);
		std1.add(s3);
		std1.add(s1);
		
		List< Student> std2 = new ArrayList<Student>();
		std2.add(s4);
		std2.add(s1);
		std2.add(s3);
		
		List< Student> std3 = new ArrayList<Student>();
		std3.add(s4);
		std3.add(s2);
		std3.add(s3);
		
		Teacher t1=new Teacher();
		t1.setName("Shankar");
		t1.setExp(10);
		t1.setSubject("Java");
		t1.setStudent(std3);
		
		Teacher t2=new Teacher();
		t2.setName("Mohan");
		t2.setExp(5);
		t2.setSubject("SQL");
		t2.setStudent(std2);
		
		Teacher t3=new Teacher();
		t3.setName("Darshan");
		t3.setExp(7);
		t3.setSubject("WEb application");
		t3.setStudent(std1);
		
		entityTransaction.begin();
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(s3);
		entityManager.persist(s4);
		entityManager.persist(t1);
		entityManager.persist(t2);
		entityManager.persist(t3);
		entityTransaction.commit();
		
	}
}
