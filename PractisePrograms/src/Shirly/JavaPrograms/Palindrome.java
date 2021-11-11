package Shirly.JavaPrograms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        String word ="";
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the word for checking Palindrome: ");
        word = sc.next();
        if(isPalindrome(word)){
            System.out.println("\"" +word + "\"" +"is a Palindrome");
        }
        else
            System.out.println("\"" +word + "\"" +"is not a Palindrome");
    }
    static boolean isPalindrome(String word){
        int forwardIndex = 0;
        int backwardIndex = word.length() - 1;
        while(forwardIndex<=backwardIndex){
            char startChar = word.charAt(forwardIndex);
            char endChar = word.charAt(backwardIndex);

            if(startChar!=endChar)
                return false;
            System.out.println("forwardIndex" + forwardIndex);
            forwardIndex++;
            backwardIndex--;

        }
        return true;
    }
}
