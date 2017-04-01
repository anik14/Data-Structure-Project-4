/*
File: Palindrome.java
Author: Mohammad Islam
Date: 11/10/16
HW: 4 Question 2
Description: Palindrome class
Worked with ZJ Zhang, TJ Cui and Myat oo
*/


import java.util.Scanner;
public class Palindrome
{

    public static boolean palindrome(String word)
    {
        if(word.length() == 0 || word.length() == 1)
        {
                        return true; 
                        }
        if(word.charAt(0) == word.charAt(word.length()-1))
        {
                       return palindrome(word.substring(1, word.length()-1));
                       }
      else
      {
        return false;
        }
    }

    public static void main(String[]args)
    {
        Scanner word = new Scanner(System.in);
        System.out.println("type a word to check if its a palindrome or not");
        String sym = word.nextLine();
        if(palindrome(sym))
            System.out.println(sym + " is a palindrome");
        else
            System.out.println(sym + " is not a palindrome");
    }
}