/*Calculate sum of non-prime index values in an array:
 
What is a prime number?
            A prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself. In other words, a prime number is a whole number greater than 1, whose only two whole-number factors are 1 and itself.  The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29.
 
Given an array with ‘N’ elements, you are expected to find the sum of the values that are present in non-prime indexes of the array. Note that the array index starts with 0 i.e. the position (index) of the first array element is 0, the position of the next array element is 1, and so on.
Example 1: If the array elements are {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}, then the values at the non-prime index are 10,20,50,70,90,100 and their sum is 340.
Example 2: If the array elements are {-1, -2, -3, 3, 4, -7}, then the values at the non-prime index are -1,-2, 4 and their sum is 1.
Example 3: If the array elements are {-4, -2}, the values at the non-prime index are -4,-2 and their sum is -6.
 
The function prototype should be as below –
            int sumOfNonPrimeIndexValues(int input1[], int input2);
where input1 is the given array, and
input2 is the no. of elements in the array.
*/

public class NonPrimeIndexSum {

    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] array2 = {-1, -2, -3, 3, 4, -7};
        int[] array3 = {-4, -2};

        System.out.println(sumOfNonPrimeIndexValues(array1, array1.length)); // Output: 340
        System.out.println(sumOfNonPrimeIndexValues(array2, array2.length)); // Output: 1
        System.out.println(sumOfNonPrimeIndexValues(array3, array3.length)); // Output: -6
    }

    public static int sumOfNonPrimeIndexValues(int[] input1, int input2) {
        int sum = 0;
        for (int i = 0; i < input2; i++) {
            if (!isPrime(i)) {
                sum += input1[i];
            }
        }
        return sum;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
