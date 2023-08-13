/*Print all even numbers till n.*/

import java.util.*;

public class prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(int i = 0;i<=n;i+=2) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
