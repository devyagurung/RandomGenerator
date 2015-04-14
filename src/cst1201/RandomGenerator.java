package cst1201;

import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {

    public static void main(String[] args) {
         //TODO: Create a Scanner object to read keyboard input.
        Scanner scanner = new Scanner(System.in);

        //TODO: Ask the user a lower and upper bound.
        System.out.println("Enter a lower bound");
        int lower = scanner.nextInt();

        System.out.println("Enter an uppper bound");
        int upper = scanner.nextInt();

        //TODO: Ask the user for the number of random integers to generate.
        int min = lower, max = 0, count, sum = 0;
        double average = 0;

        System.out.println("Enter the number of random integers to generate? ");
        count = scanner.nextInt();
        
        
        //TODO: Generate random integers of the desired length and bound.
        Random r = new Random();
        //System.out.println();
        for (int i = 0; i < count; i++) {
            int num = r.nextInt(upper - lower) + 1 + lower;
            average += num;
            sum += num;
            if (max < num) {
                max = num;
            }
            for (int j = 0; j < max; j++) {

                if (num < lower) {
                    lower++;
                    min = lower;
            
            }
        }
        average = average / count;

        //TODO: Print the average, max, min, count, and sum of the integers.
        System.out.println("the average: " + average);
        System.out.println("the max: " + max);
        System.out.println("the min: " + min);
        System.out.println("count: " + count);
        System.out.println("sum " + sum);

    }

}
}
