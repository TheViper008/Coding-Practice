/*Print the pattern
1
12
123
1234
12345
*/

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		/*Print the pattern
		
		12345
		1234
		123
		12
		1
		*/
		for(int i =n;i>=1;i--) {
			for(int j =1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		sc.close();

	}

}
