//3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
//2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
//When user enters 'Generate Bill' option , display total bill & exit.
//(No need of any class, and no need to display the food deatils. Only display the total of orderd
//food)

import java.util.Scanner;

public class Assignment1_3 {

	public static void main(String[] args) 
	
	{
		int choice;
		int total=0;
		int order=0;
		do {
		System.out.println("MENU");
		System.out.println("0. Exit");
		System.out.println("1. Dosa   Rs.30/-");
		System.out.println("2. Samosa Rs.15/-");
		System.out.println("3. Idli   Rs.20/-");
		System.out.println("4. Total Bill");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			total= total + 30;
			System.out.println("Purchased Dosa :)");
			order++;
			break;
		case 2:
			total = total + 15;
			System.out.println("Purchased Samosa :)");
			order++;
			break;
		case 3:
			total = total + 20;
			System.out.println("Purchased Idli :)");
			order++;
			break;	
		case 4:
			System.out.println("Number of Orders = "+order);
			System.out.println("Total Bill = "+total);
			break;
			
		default:
			System.out.println("Not Avilable :(");
			break;
		}
		
		}while(choice != 0);
	}

}
