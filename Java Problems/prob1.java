/*Make a Calculator. Take 2 numbers (a & b) from the user and 
an operation as follows : 
1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it
to the user.*/

import java.util.*;

public class prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		double num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		double num2 = sc.nextInt();
		System.out.println("Enter the operation(in terms of number):");
		int op = sc.nextInt();
		
		switch(op) {
		case 1 : System.out.println(num1+" + "+num2+" = "+(num1+num2));
		break;
		case 2 : System.out.println(num1+" - "+num2+" = "+(num1-num2));
		break;
		case 3 : System.out.println(num1+" * "+num2+" = "+(num1*num2));
		break;
		case 4 : System.out.println(num1+" / "+num2+" = "+(num1/num2));
		break;
		case 5 : System.out.println(num1+" % "+num2+" = "+(num1%num2));
		break;
		
		}
		sc.close();
	}

}
