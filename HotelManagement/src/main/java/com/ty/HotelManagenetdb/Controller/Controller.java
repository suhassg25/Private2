package com.ty.HotelManagenetdb.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ty.HotelManagenetdb.dao.FoodOrderdao;
import com.ty.HotelManagenetdb.dao.Menudao;
import com.ty.HotelManagenetdb.dao.Userdao;
import com.ty.HotelManagenetdb.dto.FoodOrder;
import com.ty.HotelManagenetdb.dto.Item;
import com.ty.HotelManagenetdb.dto.Menu;
import com.ty.HotelManagenetdb.dto.Product;
import com.ty.HotelManagenetdb.dto.User;

public class Controller {
	public static void main(String[] args) {
		Userdao dao = new Userdao();
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		while (b) {
			System.out.println("1.Login \n2.Signup");
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("Enter your email");
				String email = sc.next();
				System.out.println("Enter ypur password");
				String password = sc.next();
				User user = dao.findUserByEmail(email);
				if (user.getPassword().equals(password)) {
					if (user.getRole().equals("Manager")) {
						System.out.println("1.Create Menu \n2.Update menu");
						int menuchoice = sc.nextInt();
						Menu menu = new Menu();
						switch (menuchoice) {
						case 1: {

							System.out.println("Enter the Menu name");
							menu.setName(sc.next());
							boolean menub = true;
							List<Item> list = new ArrayList<Item>();
							while (menub) {
								Item items = new Item();
								System.out.println("Enter the item name");
								items.setIname(sc.next());
								System.out.println("Enter thr price ");
								items.setCost((long) sc.nextDouble());
								System.out.println("Enter the desc");
								items.setDiscription(sc.next());
								list.add(items);
								System.out.println("Enter 1 to add another item");
								if (sc.nextInt() == 1) {
									menub = true;
								} else {
									menub = false;
								}
							}
							menu.setItem(list);
							Menudao menuDao = new Menudao();
							menuDao.saveMenu(menu);
						}
							break;
						case 2: {
							System.out.println("Enter the Menu name to be updated");
							menu.setName(sc.next());
							boolean menub = true;
							List<Item> list = new ArrayList<Item>();
							while (menub) {
								Item items = new Item();
								System.out.println("Enter the item name");
								items.setIname(sc.next());
								System.out.println("Enter thr price ");
								items.setCost((long) sc.nextDouble());
								System.out.println("Enter the desc");
								items.setDiscription(sc.next());
								list.add(items);
								System.out.println("Enter 1 to add another item 2 to exit");
								if (sc.nextInt() == 1) {
									menub = true;
								} else {
									menub = false;
								}
							}
							menu.setItem(list);
							Menudao menuDao = new Menudao();
							menuDao.saveMenu(menu);
						}

							break;

						default:
							break;
						}

					} else if (user.getRole().equals("Staff")) {
						System.out.println("1.Create FoodOrder");
						System.out.println("2.Update FoodOrder");
						int orderchoice = sc.nextInt();
						switch (orderchoice) {
						case 1:
							FoodOrder foodOrder = new FoodOrder();
							System.out.println("Enter the Customers name");
							foodOrder.setName(sc.next());
							System.out.println("Enter the Customers address");
							foodOrder.setAddress(sc.next());
							System.out.println("Enter the Customers phone");
							foodOrder.setPhone(sc.nextLong());
							System.out.println("Pick the Menu");
							int menuid = sc.nextInt();
							Menudao menuDao = new Menudao();
							Menu menu = menuDao.getMenuById(menuid);
							List<Item> foodItems = menu.getItem();
							for (Item foodItem : foodItems) {
								System.out.println("Id-->   " + foodItem.getId());
								System.out.println("Name-->  " + foodItem.getIname());
								System.out.println("Discription-->  " + foodItem.getDiscription());
								System.out.println("Cost of food--> " + foodItem.getCost());

							}

							System.out.println("Enter the food Id ");
							int foodId = sc.nextInt();
							System.out.println("Enter the quantity");
							int quantity = sc.nextInt();
							List<Product> products = new ArrayList<Product>();
							Product product = new Product();
							product.setQuantity(quantity);
							for (Item items : foodItems) {
								if (items.getId() == foodId) {
									product.setName(items.getIname());
									product.setPrice(items.getCost());
									products.add(product);
								}

							}
							double totalcost = 0;
							for (Product p : products) {
								totalcost = (totalcost) + (p.getQuantity() * p.getPrice());
								foodOrder.setTotalcost(quantity);
							}
							foodOrder.setTotalcost(totalcost);
							foodOrder.setList(products);
							FoodOrderdao dao2 = new FoodOrderdao();
							dao2.saveMenu(foodOrder);
							break;

						default:
							break;
						}

					}
				} else {
					System.out.println("Invalid Password");
					break;
				}
			}
				break;
			case 2:
				System.out.println("Enter your name");
				String name = sc.next();
				System.out.println("Enter your email");
				String email = sc.next();
				System.out.println("Enter your password");
				String password = sc.next();
				System.out.println("Enter your phone");
				long phone = sc.nextLong();
				System.out.println("Enter your choice for role \n 1.Manager \n 2.Staff");
				int rolechoice = sc.nextInt();
				User user = new User();
				switch (rolechoice) {
				case 1:
					user.setRole("Manager");
					break;
				case 2:
					user.setRole("Staff");
					break;

				}
				System.out.println("Enter your company");
				String company = sc.next();

				user.setName(name);
				user.setEmail(email);
				user.setPassword(password);
				user.setPhone_number(phone);
				user.setCompany(company);
				dao.saveUser(user);
				System.out.println("Sucessfully signed up");

				break;

			default:
				b = false;
				break;
			}
		}

	}

}
