package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp = new Department(1, "books");
		
		Seller seller = new Seller(1, "bob", "bob@gmail.com", new Date(), 2000.0, dp);
		
		System.out.println(seller);

	}

}
