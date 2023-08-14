//Write a function that calculates the Greatest Common Divisor of 2 numbers.

import java.util.*;
public class prob5 {
	
	public static int CalculateGCD(int a,int b) {
		if(b==0) {
			return a;
		}
		else
			return CalculateGCD(b,a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		System.out.println("GCD = "+CalculateGCD(num1,num2));
		
		sc.close();
	}

}
