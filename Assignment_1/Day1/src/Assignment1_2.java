//2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
//doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.
//Hint : Check Scanner class for the methods

import java.util.Scanner;

public class Assignment1_2 {

	public static void main(String[] args) {
		double num1;
		double num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two double values : ");
//		num1=sc.nextDouble();
//		num2=sc.nextDouble();
		if(sc.hasNextDouble())
		{
			num1=sc.nextDouble();
			System.out.println("Enter num2: ");
			  if(sc.hasNextDouble()) 
			  {
			    num2=sc.nextDouble();
			    System.out.println("Average :"+(num1+num2)/2);
			  }
			  else
				  System.out.println("Please check entered values..."+sc.next());
		}
		else
			System.out.println("Please check entered values..."+sc.next());			
	}

}
