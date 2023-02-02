package come.ty.onetoonebidb.controller;

import come.ty.onetoonebidb.dao.Persondao;
import come.ty.onetoonebidb.dto.PanCard;
import come.ty.onetoonebidb.dto.Person;

public class MainClassEntry {

	public static void main(String[] args) {

		Person person = new Person();
		person.setName("suhas");
		person.setAge(26);
		person.setAdress("Banglore");

		
		PanCard panCard = new PanCard();
		panCard.setName("suhas s g");
		panCard.setPanumber("CGIT25Y");
		
		person.setPancard(panCard);
		panCard.setPerson(person);
		
		Persondao dao = new Persondao();
		dao.savePerson(person);
		
	
		
	}

}
