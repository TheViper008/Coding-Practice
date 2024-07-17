/*Find Password:
Detective Buckshee Junior has been approached by the shantiniketan kids society for help in finding the password to the games complex. After hearing the scenario, detective Buckshee Junior realises that he will need a programmer's support. He contacts you and requests your help. Please help the detective by writing a function to generate the password.
 
The scenario is as below -
Five numbers are available with the kids.
These numbers are either stable or unstable.
A number is stable if each of its digit occur the same number of times, i.e. the frequency of each digit in the number is the same. For e.g. 2277, 4004, 11, 23, 583835, 1010 are examples of stable numbers.
Similarly, A number is unstable if the frequency of each digit in the number is NOT the same. For e.g. 221, 4314, 101, 233, 58135, 101 are examples of unstable numbers..
 
The password can be found as below -
i.e. password = sum of all stable numbers - sum of all unstable numbers.
 
Assuming that the five numbers are passed to a function as input1, input2, input3, input4 and input5, complete the function to find and return the password.
For Example:
If input1 = 12, input2 = 1313, input3 = 122, input4 = 678, and input5 = 898,
stable numbers are 12, 1313 and 678
unstable numbers are 122 and 898
So, the password should be = sum of all stable numbers - sum of all unstable numbers = 983
*/

public class PasswordFinder {

    public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
        int[] inputs = {input1, input2, input3, input4, input5};
        int stableSum = 0;
        int unstableSum = 0;

        for (int num : inputs) {
            if (isStable(num)) {
                stableSum += num;
            } else {
                unstableSum += num;
            }
        }

        return stableSum - unstableSum;
    }

    private static boolean isStable(int num) {
        String numStr = String.valueOf(num);
        int[] digitCount = new int[10]; // Array to count occurrences of each digit (0-9)

        // Count occurrences of each digit in the number
        for (char c : numStr.toCharArray()) {
            int digit = c - '0';
            digitCount[digit]++;
        }

        // Check if all non-zero digit counts are the same
        int stableCount = 0;
        for (int count : digitCount) {
            if (count > 0) {
                if (stableCount == 0) {
                    stableCount = count;
                } else if (count != stableCount) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int input1 = 12;
        int input2 = 1313;
        int input3 = 122;
        int input4 = 678;
        int input5 = 898;

        int password = findPassword(input1, input2, input3, input4, input5);
        System.out.println("Password: " + password); // Output: 983
    }
}
