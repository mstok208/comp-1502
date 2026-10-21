package mru.lab3.application;

import java.util.Scanner;

import mru.lab3.controller.Time;

/**
This program demonstrates the Time class.
*/

public class TimeDemo
{
public static void main(String[] args)
{
   Scanner keyboard = new Scanner(System.in);
   char answer = 'Y';
   String enteredTime;
   String response;
   
//⭐️Task #3, part 1
   while (Character.toUpperCase(answer) == 'Y')
   {
      System.out.print("Enter a military time using the ##:## format: "); 
      enteredTime = keyboard.nextLine();
      
      System.out.println("Do you want to enter another (Y/N)? ");
      response = keyboard.nextLine();
      
      answer = response.charAt(0);
   }
}
}
