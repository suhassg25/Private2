package onetomanyuni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Cartadding {

	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("uni");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter item 1 name price and manufacturer");
	Item i1=new Item();//Items 1
	String i11=scanner.next();
	int i12=scanner.nextInt();
	String i13=scanner.next();
	i1.setName(i11);
	i1.setPrice(i12);
i1.setManufacture(i13);

System.out.println("Enter item 2 name price and manufacturer");
Item i2=new Item();//Items 2
String i21=scanner.next();
int i22=scanner.nextInt();
String i23=scanner.next();
i2.setName(i21);
i2.setPrice(i22);
i2.setManufacture(i23);
	
Cart c=new Cart();
System.out.println("Enter cart owners name email and address");
String c1=scanner.next();
String c2=scanner.next();
String c3=scanner.next();
 c.setName(c1);
 c.setEmail(c2);
 c.setAddress(c3);
 
 List <Item> i=new ArrayList(); //list used to store items
 i.add(i1);
 i.add(i2);
 
 c.setItem(i);//sent item to cart via list
 
 entityTransaction.begin();

 entityManager.persist(i1);//item1 to item
 entityManager.persist(i2);//item2 to item
 entityManager.persist(c);//cart 
 
 entityTransaction.commit();

	}

}
