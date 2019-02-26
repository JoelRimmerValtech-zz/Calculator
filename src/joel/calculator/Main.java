package joel.calculator;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Type a random number");
        Scanner scanner = new Scanner(System.in); int numberone = scanner.nextInt();
        System.out.println("Type a second random number");
        int numbertwo = scanner.nextInt();
        System.out.println("Insert an operation of either '+', '-' or '*'");
        String input = scanner.next();

        if (input.equals("+")){
            System.out.println("The answer is " + (numberone + numbertwo));
        }
        else if (input.equals("-")){
            System.out.println("The answer is " + (numberone - numbertwo));
        }
        else if (input.equals("*")){
            System.out.println("The answer is " + (numberone * numbertwo));
        }



    }
}
