package com.max.training;

public class SwapOrderElements
{
    //Поменять первый положительный элемент с последним положительным, второй
    //с предпоследним и т.д.
    public void swapOrderElements(int[] arr)
    {
        int lowIndex = 0;
        int highIndex = arr.length-1;

        while(lowIndex < highIndex) {
            int lowVal = arr[lowIndex];
            int highVal = arr[highIndex];
            arr[lowIndex] = highVal;
            arr[highIndex] = lowVal;

            lowIndex += 1;
            highIndex -=1;
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
