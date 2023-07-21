package flowcontrol;
import java.util.Scanner;

public class Saad {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);

        // TASK 1
//        System.out.println("Please add the first number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Please add the second number: ");
//        int num2 = sc.nextInt();
//        int result = num1 + num2;
//        System.out.println("The sum of the two numbers is: " + result);
//
//        System.out.println("Please add another number: ");
//        int num3 = sc.nextInt();
//        System.out.print("The number is: ");
//        if(num3 % 2 == 0) System.out.println("even");
//        else System.out.println("odd");
//
//        System.out.println("Please enter a traffic light colour: ");
//        String colour = sc.next();
//        if(colour.equals("green"))System.out.println("GOOO !");
//        else if(colour.equals("red"))System.out.println("STOP !");
//        else if (colour.equals("yellow"))System.out.println("Almost ... ");
//        else System.out.println("Please ... I need a traffic light colour");


        // TASK 2
//        int num;
//        do{
//            System.out.println("Please enter a valid number between 1 and 12");
//            num = sc.nextInt();
//        }
//        while(num < 1 || num > 12);
//        switch(num){
//            case 11:
//            case 12:
//            case 1:
//                System.out.println("Winter");
//                break;
//            case 2:
//            case 3:
//            case 4:
//                System.out.println("Spring");
//                break;
//            case 5:
//            case 6:
//            case 7:
//                System.out.println("Summer");
//                break;
//            case 8:
//            case 9:
//            case 10:
//                System.out.println("Autumn");
//                break;
//        }

        // TASK 3
        System.out.println("Please enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter a number: ");
        int num2 = sc.nextInt();
        System.out.println("Please enter a valid operator: ");
        String operator = sc.next();

        switch (operator){
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
