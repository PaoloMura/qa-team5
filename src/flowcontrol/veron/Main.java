package flowcontrol.veron;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("please input two numbers");
//        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        if (num1 > num2){
//            System.out.println("num1 is bigger than num2");
//        } else {
//            System.out.println("num2 is bigger than num1");
//        }
//
//        System.out.println("please provide another number and i will say if it is odd or even");
//        int num3 = scanner.nextInt();
//        if (num3 % 2 == 0){
//            System.out.println("number provided is even");
//        } else {
//            System.out.println("number provided is odd");
//        }
//
//        System.out.println("please provide a traffic stop colour and i will say what it means");
//        Scanner scanner2 = new Scanner(System.in);
//
//        String color = scanner2.nextLine();
//
//        if (color.equals("green".toLowerCase())){
//            System.out.println("green means go");
//        } else if (color.equals("red".toLowerCase())){
//            System.out.println("red means stop");
//        }else if (color.equals("yellow".toLowerCase())) {
//            System.out.println("yellow means you can go soon");
//        } else {
//            System.out.println("thats an invalid color");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("provide a number between 1 and 12 and i will tell you what month it is");
        int num1 = scanner.nextInt();

        if (num1 > 0 && num1 < 13){
            switch (num1){
                case (12): case(1): case(2):
                    System.out.println("that number corresponds to a winter month");
                case (3): case(4): case(5):
                    System.out.println("that number corresponds to a spring month");
                case (6): case(7): case(8):
                    System.out.println("that number corresponds to a summer month");
                case (9): case(10): case(11):
                    System.out.println("that number corresponds to a autumn month");
            }
        }


    }
}
