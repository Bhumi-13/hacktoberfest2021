import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args){
        // palindrime numbers are same after reversing it
        //eg 545 343 171 58985
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int reverseNum= 0;
        int originalNum = num;

        //reverse a number
        for(; num!=0; num=num/10){  //semicoln is given in start bcuz intialization is not done
            int remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
        }
        System.out.println(reverseNum);
        if(originalNum == reverseNum){
            System.out.println(originalNum + "is a palindrome number");
        }
        else{
            System.out.println(originalNum + "is not a palindrome number");
        }
    }
}
