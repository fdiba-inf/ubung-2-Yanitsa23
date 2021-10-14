package exercise2;

import java.util.Scanner;

public class Circle {
   
      public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        float r = input.nextFloat();
        double pi = 3.14;
        double c = 2*pi*r;
        double a = pi*r*r;
       System.out.println("Circumference: " + c);
       System.out.println("Area:" + a);
      }
}