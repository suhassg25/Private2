package come.ty.onetoonebidb.controller;

import come.ty.onetoonebidb.dao.Persondao;
import come.ty.onetoonebidb.dto.PanCard;
import come.ty.onetoonebidb.dto.Person;

public class MainClassFetch {
	static Persondao persondao = new Persondao();
	
	
	
	static void Panfetch(int id)
	{
		Person person =persondao.fetchPerson(id);
		PanCard pan=persondao.fetchPan(id);
		System.out.print(pan +" "+person);
	
	}
	public static void main(String[] args) {
	int id=2;
		Panfetch(id);
		
		
	}

}
