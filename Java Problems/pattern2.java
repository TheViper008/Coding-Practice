/*Print the pattern
   *****
   *   *
   *   *
   *****    
   
 */
public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {        //columns
			for(int j=1;j<=5;j++) {    //rows
				if(i==1 || j==1 || i==4 || j==5)      //first and last row or column
					System.out.print("*");    
				else
					System.out.print(" ");
			}
			System.out.println();
		}
				

	}

}
