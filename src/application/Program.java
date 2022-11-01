package application;

import java.util.Date;

import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "BOB", "bob@gmail.com", new Date(), 3000.0,obj);
		
		System.out.println(seller);
		
	}

}
