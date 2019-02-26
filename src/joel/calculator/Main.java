package joel.calculator;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);

        System.out.println("First random number is: " + randomNumber);
        System.out.println("Second random number is: " + randomNumber2);

        System.out.println("Insert an operation of either '+', '-' or '*'");

        Scanner scanner = new Scanner(System.in); String input = scanner.next();

        if (input.equals("+")){
            System.out.println("The answer is " + (randomNumber + randomNumber2));
        }
        else if (input.equals("-")){
            System.out.println("The answer is " + (randomNumber - randomNumber2));
        }
        else if (input.equals("*")){
            System.out.println("The answer is " + (randomNumber * randomNumber2));
        }



    }
}
