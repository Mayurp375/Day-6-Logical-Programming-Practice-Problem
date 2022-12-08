package Day6PracticeProblemLogicalProgramming;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }if (sum == num) {
            System.out.println(num  + " is perfect number");
        } else {
            System.out.println(" not perfect");
        }
    }
}
