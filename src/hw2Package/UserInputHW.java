package hw2Package;
import java.util.Scanner;

public class UserInputHW {
		
	
		
//		static int fib(userInt) {
//		if(userInt <= 1)
//			return userInt;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner userChoice = new Scanner(System.in);
//		System.out.println("Please pick a number type: ");
//		System.out.println("Fibonacci");
//		System.out.println("Armstrong");
//		System.out.println("Palindrome");
//		
//		
//		String userPick = userChoice.nextLine();
//		
//		switch(userPick) {
//		case "Fibonacci":
//			
//		}
		
		
		//- Scanner for checking user input
		Scanner inputCheck = new Scanner(System.in);
		System.out.println("Please enter a number.");
		
		
		//- Data for user number
		int userInt = inputCheck.nextInt();
		
		
//		1) Write Fibonanacci series between the user entered start and end values
		
		System.out.println("---Fibonacci Series---");
		
		//- Fiboncacci series always start with 0 & 1, so values are hard coded
		int n1 = 0, n2 = 1;
		int n3 = userInt;
		System.out.println(n1);
		System.out.println(n2);
		
		
		//- For loop that adds the last 2 numbers printed for a new number
		for(int i=2;i < userInt; ++i) {
			n3=n1+n2;
			System.out.println("" + n3);
			//-Replace hard coded values with new values produced from loop
			n1=n2;
			n2=n3;
			continue;
		}
		
		
//		2) Determine whether a user entered number is an Armstrong number
		
		System.out.println("---Armstrong Check---");
		
		//- Control values
		int originalNumber, remainder, result = 0, n = 0;
		
		originalNumber = userInt;
		
		//- "Armstrong math" multiplies digits by the power of total digits.
		// Ex. "153": Digits are cubed because there's 3 digits. 
		// EX. "2,056": Digits are multiplied to the 4th power due to their being 4 digits total. 
		
		
		//For loop that determines the exponent that each digit will be multiplied to
		for(;originalNumber !=0; originalNumber/=10, ++n);
				
		originalNumber = userInt;
		
		//For loop that performs the "Armstrong equation": digit1^n + digit2^n... = userInt 
		for(;originalNumber !=0; originalNumber/=10) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, n);
		}
		
		if(result == userInt)
			System.out.println(userInt + " is an Armstrong number.");
		else
			System.out.println(userInt + " is not an Armstrong number.");
		
//		3) Write a program to see if a user entered string is a palindrome or not
		
		String userInput = inputCheck.next();
		

	}

}
