/*
User ID Generation: Joseph’s team has been assigned the task of creating user-ids for all participants of an online gaming competition. Joseph has designed a process for generating the user-id using the participant’s First_Name, Last_Name, PIN code and a number N. The process defined by Joseph is as below –
 
Step1 - Compare the lengths of First_Name and Last_Name of the participant. The one that is shorter will be called “Smaller Name” and the one that is longer will be called the “Longer Name”. If both First_Name and Last_Name are of equal Length, then the name that appears earlier in alphabetical order will be called “Smaller Name” and the name that appears later in alphabetical order will be called the “Longer Name”.
 
Step2 - The user-id should be generated as below –
Last Letter of the smaller name + Entire word of the longer name + Digit at position N in the PIN when traversing the PIN from left to right + Digit at position N in the PIN when traversing the PIN from right to left
 
Step3 - Toggle the alphabets of the user-id generated in step-2 i.e. upper-case alphabets should become lower-case and lower-case alphabets should become upper-case.
 
Let us see a few examples.
 
Example-1 - If the participant’s details are as below -
First_Name = Rajiv
Last_Name = Roy
PIN = 560037
N = 6
Step1 - Length of Last_Name is less than the Length of First_Name, so the Smaller Name is “Roy” and the Longer Name is “Rajiv”
Step2 - The user-id will be = Last Letter of the smaller name + Entire word in the longer name + Digit at position N in the PIN when traversing the PIN from left to right + Digit at position N in the PIN when traversing the PIN from right to left
= Last Letter of “Roy” + Entire word in “Rajiv” + 6th Digit of PIN from left + 6th Digit of PIN from right
= y + Rajiv + 7 + 5
Therefore, user-id = yRajiv75
Step3 - Toggle the alphabets in the user-id. So, user-id = YrAJIV75
 
Example-2 - If the participant’s details are as below -
First_Name = Manoj
Last_Name = Kumar
PIN = 561327
N = 2
Step1 - Length of First_Name is equal to the Length of Last_Name. Alphabetically, ‘Kumar’ appears earlier than ‘Manoj’ (by comparing alphabetic positions of ‘K’ and ‘M’) so the Smaller Name is “Kumar” and the Longer Name is “Manoj”
Step2 - The user-id will be = Last Letter of the smaller name + Entire word in the longer name + Digit at position N in the PIN when traversing the PIN from left to right + Digit at position N in the PIN when traversing the PIN from right to left
= Last Letter of “Kumar” + Entire word in “Manoj” + 2nd Digit of PIN from left + 2nd Digit of PIN from right
= r + Manoj + 6 + 2
Therefore, user-id = rManoj62
Step3 - Toggle the alphabets in the user-id. So, user-id = RmANOJ62
 
Example-3 - If the participant’s details are as below -
First_Name = Kumud
Last_Name = Kumar
PIN = 561327
N = 2
Step1 - Length of First_Name is equal to the Length of Last_Name. Alphabetically, ‘Kumar’ appears earlier than ‘Kumud’ (by comparing alphabetic positions of ‘Kuma’ and ‘Kumu’) so the Smaller Name is “Kumar” and the Longer Name is “Kumud”
Step2 - The user-id will be = Last Letter of the smaller name + Entire word in the longer name + Digit at position N in the PIN when traversing the PIN from left to right + Digit at position N in the PIN when traversing the PIN from right to left
= Last Letter of “Kumar” + Entire word in “Kumud” + 2nd Digit of PIN from left + 2nd Digit of PIN from right
= r + Kumud + 6 + 2
Therefore, user-id = rKumud62
Step3 - Toggle the alphabets in the user-id. So, user-id = RkUMUD62
 
You are part of Joseph’s team and he has asked you to write a program (method) to generate the participant’s user-id using the above rules.
 
You are expected to write the logic within the method (function) userIdGeneration which provides 4 inputs as below -
input1 is the First_Name,
input2 is the Last_Name
input3 is the PIN
input4 is the number N
 
The method (function) should do the processing as per rules explained above and should return the generated user-id.
 
Assumption - For convenience of this assessment question, Let us assume that the value of N (input4) will always be less than or equal to the number of digits in the PIN. */

public class UserID {
    public static void main(String[] args) {
        String first_name = "Rajiv";
        String last_name = "Roy";
        String pin = "560037";
        int n = 6;
        System.out.println("User ID is: " + userIdGeneration(first_name, last_name, pin, n));
    }

    public static String userIdGeneration(String first_name, String last_name, String pin, int n){
        StringBuilder userid = new StringBuilder();
        String smallerName, longerName;
        if(first_name.length() == last_name.length()){
            if(first_name.compareTo(last_name) < 0){
                smallerName = first_name;
                longerName = last_name;
            }
            else{
                smallerName = last_name;
                longerName = first_name;
            }
        }
        else if(first_name.length() < last_name.length()){
            smallerName = first_name;
            longerName = last_name;
        }
        else{
            smallerName = last_name;
            longerName = first_name;
        }

        userid.append(smallerName.charAt(smallerName.length() - 1));

        userid.append(longerName);

        char leftdigit = pin.charAt(n-1);
        userid.append(leftdigit);
        char rightdigit = pin.charAt(pin.length()-n);
        userid.append(rightdigit);

        return toggleAlphabets(userid.toString());

    }

    public static String toggleAlphabets(String userid){
        StringBuilder toggled = new StringBuilder();
        for(char c : userid.toCharArray()){
            if(Character.isUpperCase(c)){
                toggled.append(Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(c)){
                toggled.append(Character.toUpperCase(c));
            }
            else{
                toggled.append(c);
            }
        }

        return toggled.toString();
    }
}
