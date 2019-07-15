package com.max.training;

import java.util.Scanner;

public class NumOfEqual
{
    public void countNumOfEqual(int[] arr)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number and the program will print out\nthe number of same elements in an array: ");
        int guessNumber = scanner.nextInt();
        int counter = 0;
        for (int num: arr)
        {
            if(num == guessNumber)
            {
                counter++;
            }
        }

        System.out.println("Number of same elements in an array: " + counter);
    }
}
