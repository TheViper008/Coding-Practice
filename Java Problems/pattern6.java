/*Print the pattern
1
2 3
4 5 6
7 8 9 10
*/
import java.util.Scanner;
public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int number = 1;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
		sc.close();
	}

}
