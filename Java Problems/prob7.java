//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 21 ..... 



import java.util.Scanner;

public class prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series of " + n + " terms:");
        printFibonacciSeries(n);
        
        sc.close();
    }

    public static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

