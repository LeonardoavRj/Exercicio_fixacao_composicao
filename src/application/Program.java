package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitie.Client;
import entitie.Order;
import entitieenum.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		// Exercício de fixação composições.
		  Locale.setDefault(Locale.US);
		  Scanner sc = new Scanner(System.in);
		  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		  
		  System.out.println("Enter cliente data:");
		  System.out.print("Name: ");
		  String name = sc.nextLine();
		  System.out.print("E-mail: ");
		  String email = sc.nextLine();
		  System.out.println("Birth date (DD/MM/YYYY): ");
		  Date birthdate = sdf.parse(sc.next());
		  
		  Client client = new Client(name, email, birthdate);
		  
		  System.out.println("Enter order data:");
		  System.out.print("Status: ");
		  OrderStatus status = OrderStatus.valueOf(sc.next());
		  
		  Order order = new Order(new Date(), status);
		  
		  System.out.print("How many items to this order? ");
		  int n = sc.nextInt();
		  
		  for (int i = 1; i <= n; i++) {
			  
		  }
		  
		  
		  
		  
		  sc.close();
		  
		  

	}

}
