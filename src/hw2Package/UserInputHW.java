package hw2Package;
import java.util.Scanner;

public class UserInputHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userChoice = new Scanner(System.in);
		System.out.println("Please pick a number.");
		
		Scanner inputCheck = new Scanner(System.in);
		System.out.println("Please enter a number.");
		
		int userInt = inputCheck.nextInt();
		
		
		
		
		switch(char) {
		case "y":
			
		}
		
//		1) Write Fibonanacci series between the user entered start and end values
		
		
		int n1 = 0, n2 = 1;
		int n3 = userInt;
		System.out.println(n1);
		System.out.println(n2);
		
		
		
		for(int i=2;i < userInt; ++i) {
			n3=n1+n2;
			System.out.println("" + n3);
			n1=n2;
			n2=n3;
			continue;
		}
		
		
//		2) Determine whether a user entered number is an Armstrong number
		
		
		
//		3) Write a program to see if a user entered string is a palindrome or not
		

	}

}
