package com.ty.onetomany2.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle.Control;

import com.ty.onetomany2.controller.Controls;
import com.ty.onetomany2.dto.Phone;
import com.ty.onetomany2.dto.Sim;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Phone phone = new Phone();

		phone.setColor("Blue");
		phone.setCost(15000);
		phone.setName("Redmi");
		phone.setRam(6);

		Sim s1 = new Sim();
		s1.setNumber(78238468);
		s1.setBalance(100.8);
		s1.setNetwork("jio");
		s1.setPhone(phone);

		Sim s2 = new Sim();
		s2.setNumber(872587233);
		s2.setBalance(12.11);
		s2.setNetwork("airtel");
		s2.setPhone(phone);

		List<Sim> sim = new ArrayList();
		sim.add(s1);
		sim.add(s2);

		phone.setSim(sim);

		Controls controls = new Controls();
		controls.save(phone);

	}

}
