/*Find the one digit to be removed to form palindrome*/


public class PalindromeDigitRemoval {
    public static boolean isPalindrome(String num){
        // String numStr = Integer.toString(num);
        // String revStr = new StringBuilder(numStr).reverse().toString();
        int left = 0;
        int right = num.length()-1;

        while(left < right){
            if(num.charAt(left) != num.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;    
    }

    public static int digitToRemove(int num){
        String numStr = Integer.toString(num);
        if(isPalindrome(numStr)){
            return -1;
        }

        for(int i = 0;i<numStr.length();i++){
            StringBuilder sb = new StringBuilder(numStr);
            sb.deleteCharAt(i);
            String modString = sb.toString();
            
            if(isPalindrome(modString)){
                return Character.getNumericValue(numStr.charAt(i));
            }

        }

        return -1;
    }
    
    public static void main(String[] args) {
        int a = 134531;
        System.out.println(digitToRemove(a));
        
    }
}
