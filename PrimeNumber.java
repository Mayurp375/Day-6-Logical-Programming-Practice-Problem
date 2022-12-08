package Day6PracticeProblemLogicalProgramming;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter number to check prime or not");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean prim = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prim =true;
            }
        }
        if (!prim) {
            System.out.println("its prime number");
        } else {
            System.out.println("it not prime");
        }
    }
}
