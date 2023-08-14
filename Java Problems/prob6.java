//Print factorial of a number using functions 

import java.util.*;
public class prob6 {
	
	public static int CalculateFactorial(int n) {
		
		if(n < 0) {
			System.out.println("Invalid Input");
		}
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact = fact * i;
		}
		return fact;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to find the factorial of ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The factorial of "+n+" is "+CalculateFactorial(n));
		sc.close();
	}

}
