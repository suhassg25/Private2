package _jdbc_;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Employee e= new Employee();
		EmployeeCRUD crud=new EmployeeCRUD();
		
		while(true){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("PRESS \n1 for Insertion \n\n2 for Updation \n\n3 for Delete \n\n4 for Fetch all employee details \n\n5 for perticular employee details");
		int d=scanner.nextInt();
		
		switch(d)
		{
		case 1 : {System.out.println("Enter ID");
		int id=scanner.nextInt();
		
		System.out.println("Enter Name");
		String name=scanner.next();
	
		System.out.println("Enter Phone number");
		long phone=scanner.nextLong();
				
		e.setId(id);
		e.setName(name);
		e.setPhone(phone);
		
		crud.saveEmp(e);
		
		break;
				}
		case 2 : { System.out.println("ENTER ID TO BE UPDATED");
		int Id=scanner.nextInt();
		
		System.out.println("Enter number to be changed");
		long num=scanner.nextLong();
		
		e.setPhone(num);
		
		crud.updateemp(Id, e);
		break;
				}
		case 3 :	{
			System.out.println("Enter id of employee to delete data from table");
		
		int a=scanner.nextInt();
		
		crud.delete(a);
		break;
		}
		case 4 : {crud.fetch();
		break;
				}
		case 5:	
			{System.out.println("ENTER ID OF A EMPLOYEE TO FETCH DETAILS");
			
			int id=scanner.nextInt();
			crud.fetch(id);
			break;
			}
		
		default : System.out.println("enter valid Selection"); 
		System.exit(0);
		
		
		}
		
		}
	}

}
