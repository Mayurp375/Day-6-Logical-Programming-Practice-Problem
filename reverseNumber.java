package Day6PracticeProblemLogicalProgramming;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        System.out.println("reverse number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = 0;
        int reminder;
        while (num != 0) {
            reminder = num % 10;
            temp = temp * 10 + reminder;
            num = num /10;
        }
        System.out.println(temp);
    }
}

