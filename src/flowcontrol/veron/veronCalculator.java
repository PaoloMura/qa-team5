package flowcontrol.veron;

import java.util.Scanner;

public class veronCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please provide 2 numbers");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("now please provide be with an operator, from this list: *, /, -,+ ");
        Scanner scanner2 = new Scanner(System.in);
        String op = scanner2.nextLine();
//        if (!op.equals("+")||!op.equals("-")||!op.equals("/")||!op.equals("*")){
//            System.out.println("now please provide be with an operator, from this list: *, /, -,+ ");
//        }

        switch (op){
            case ("-"):
                System.out.println(num1 - num2);
            case ("+"):
                System.out.println(num1 + num2);
            case ("/"):
                System.out.println(num1 / num2);
            case ("*"):
                System.out.println(num1 * num2);
        }



    }
}
