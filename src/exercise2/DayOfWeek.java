package exercise2;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.print("Enter a number: ");
       int number = input.nextInt();

       switch (number) {
         case 1: System.out.println("A day of week:Monday");break;
         case 2: System.out.println("A day of week:Tuesday");break;
         case 3: System.out.println("A day of week:Wednesday");break;
         case 4: System.out.println("A day of week:Thursday");break;
         case 5: System.out.println("A day of week:Friday");break;
         case 6: System.out.println("A day of week:Saturday");break;
         case 7: System.out.println("A day of week:Sunday");break;
         default:System.out.println("A day of week:Invalid day");

       }

    }

}   