import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Quadratic Equation Solver");
	System.out.println("Would you like the computer to generate an equation for you? (please enter 'yes' or 'no') ");
	String answer = in.next();
	
	//Global Variables
	//Variables a, b, c created to store the values of the coefficients
	//Set as double to hold decimals as well as integers
	double a, b, c;
	//Double x1 and x2 are global variables set to 0, they are used to store the values of the roots for each different equation
	double x1 = 0;
	double x2 = 0;
	
	//If statement to say that if the user say they want the computer to generate an equation it will give them an equation with three random numbers for the coefficients a, b, and c
	    if(answer.equals("yes"))
	    {
	        Random number = new Random();
	        a = number.nextInt(20) + 1;
	        b = number.nextDouble() * 40 - 20;
	        c = number.nextDouble() * 40 - 20;
	    }
	    else
	    { 
	 //Else if the user deos not want the computer to generate an equation, the user can enter their own desired values for a, b, and c
	        System.out.println("Enter the number value you would like for the variable a: (please note that the value for 'a' cannot equal 0)");
	        a = in.nextDouble();
	//While loop to say that if the user sets a = 0, the program will tell them to enter another number and it will keep prompting them to do that until a is > 0
	        while (a == 0)
	        {
	            System.out.println("The variable a cannot equal 0, please put in another number");
	            a = in.nextDouble();
	        }
	        System.out.println("Enter the number value you would like for the variable b:");
	        b = in.nextDouble();
	        System.out.println("Enter the number value you would like for the variable c:");
	        c = in.nextDouble();
	    }
	    System.out.println("The equation is " + a + "x^2 + " + b + "x + " + c);
	    
	    
	    //Double discontinuity is a global variable set equal to the part of the equation under the square root.
	    //This will be used for the three different cases for the quadratic formula
	    double discontinuity = b * b - 4 * a * c; 
	    
	    //Case 1: if the discontinuity is greater than 0 then there will be two real roots
	    if (discontinuity > 0)
	    {
	        x1 = (-b - Math.sqrt(discontinuity)) / (2 * a);
	        x2 = (-b + Math.sqrt(discontinuity)) / (2 * a);
	    System.out.println("Real Root #1: " + Math.round(x1));
	    System.out.println("Real Root #2: " + Math.round(x2));
	    }
	    
	    //Case 2: if the discontinuity is equal to 0 then there will be 1 real root
	    else if (discontinuity == 0)
	    {
	      x1 = -b / (2 * a); 
	    System.out.println("Real Root: " + Math.round(x1));
	    }
	    
	    //Case 3: if the discontinuity is less than 0 there will be two imaginary or "complex" roots
	    else if (discontinuity < 0)
	    {
	        
	   //If there are imaginary roots, you would have to take the absolute value of them, and put an 'i' next to the roots as to show that they are not real roots
	        double t1 = -b / (2 * a);
	        double t2 = Math.sqrt(Math.abs(discontinuity)) / (2 * a);
	        System.out.println("Imaginary Root #1: " + Math.round(t1) + " + " + Math.round(t2) + "i");
	        System.out.println("Imaginary Root #2: " + Math.round(t1) + " - " + Math.round(t2) + "i");
	    }
	    
	        
	}
}
