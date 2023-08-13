/*Print the pattern
 
 *****
 *****
 *****
 *****
 
 */
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 0;i<4;i++) {
//			System.out.println("*****");
//		}
		
		for(int i = 0;i<4;i++) {          //columns
			for(int j = 0;j<5;j++) {        //rows
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
