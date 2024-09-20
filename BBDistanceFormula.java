//******************************************************************
// BBDistanceFormula.java            Author:Brandon Bocanegra
//
// Chapter 3 Assignment Programming the Distance Formula
// Due 10/01/23
// Write a program that prompts the user to enter the (x,y) 
// Coordinates for two points using the distance formula
//******************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;


public class BBDistanceFormula
{
   //-------------------------------------------------------------
   // Determines distance using (x,y) and the distance formula
   //-------------------------------------------------------------
   public static void main (String[] args)
   {        
      
      double distance, x1, x2, y1, y2;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print ("Enter the number of x2: ");
      x2 = scan.nextDouble();
      
      System.out.print ("Enter the number of x1: ");
      x1 = scan.nextDouble();
      
      System.out.print ("Enter the number of y2: ");
      y2 = scan.nextDouble();
      
      System.out.print ("Enter the number of y1: ");
      y1 = scan.nextDouble();
      
      DecimalFormat fmt = new DecimalFormat ("0.##");
      
      distance = Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2));
      
      System.out.println("distance: " + fmt.format(distance));
     
   }
}


      
      
