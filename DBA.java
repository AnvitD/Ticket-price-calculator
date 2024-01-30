
/**
 * Help ticket booth collectors determine the correct ticket price of a person?
 */

import java.util.Scanner; 
public class DBA
{  
    public static void main(String[] args) 
   { 
       Scanner in = new Scanner(System.in); 
       double price; 
       
       System.out.println("Please enter your name.(First Last)"); 
       String name = in.nextLine(); 
       System.out.println("Please enter your age"); 
       int age = in.nextInt(); 
       
       System.out.println("Are you a first responder?(Yes/No)"); 
       String fR = in.next(); 
       System.out.println("Are you a veteran?(Yes/No)"); 
       String veteran = in.next();
      
       
       if(age < 3)
       price = 2; 
       else if( age >= 3 && age <=5)
       price = 9; 
       else if(age >= 6 && age <= 18) 
       price = 11; 
       else if( age > 18 && fR.equalsIgnoreCase("Yes") || veteran.equalsIgnoreCase("yes"))
        price = 12 * 0.50; 
       else 
       price = 12; 
       
      
       
       
       String lastName = name.split("\\s+")[1];
       
       int randomNumber = (int)(Math.random()*1000 + 1); 
       
       String userId = name.substring(0, 1) + lastName + randomNumber; 
       
       
       System.out.println("****************************************************************************************************************"); 
       System.out.println(); 
       System.out.println("Welcome to the APCS Carnival, " + name + "!"); 
       System.out.println("Your user ID is: " + userId); 
       System.out.println("The cost of the ticket is $" + price); 
       System.out.println("Have a great time at the APCS Carnival today!"); 
       System.out.println(); 
       System.out.println("****************************************************************************************************************"); 
       
       
       
       
       
    }
    }

