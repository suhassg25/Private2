import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Phone_sim {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("onemany");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
	Phone phone=new Phone();
	
		
			System.out.println("Enter number type balance and network of sim1");
			long number=s.nextLong();
			String type=s.next();
			double balance=s.nextDouble();
			String network=s.next();
			
			Sim S1=new Sim();
			S1.setNumber(number);
			S1.setType(type);
			S1.setBalance(balance);
			S1.setNetwork(network);
			
			System.out.println("Enter number type balance and network of sim2");
			long numb=s.nextLong();
			String ty=s.next();
			double bal=s.nextDouble();
			String net=s.next();
			Sim S2=new Sim();
			S2.setNumber(numb);
			S2.setType(ty);
			S2.setBalance(bal);
			S2.setNetwork(net);
			
			List <Sim> sims	= new ArrayList();
			sims.add(S1);
				sims.add(S2);
			
				
		phone.setColor("blue");
		phone.setRam(4);
		phone.setCost(15000);
		phone.setModle("Real Me");
		phone.setSim(sims);	
		
		entityTransaction.begin();
		entityManager.persist(S1);
		entityManager.persist(S2);
		entityManager.persist(phone);
		entityTransaction.commit();
	

	}

}
