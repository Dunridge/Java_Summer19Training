package com.max.training;

public class MaxIndex
{

    public void biggestElem(int[] arr)
    {
        int biggestElem = 0;
        int indexOfTheBiggest = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > biggestElem)
            {
                biggestElem = arr[i];
                indexOfTheBiggest = i;
            }
        }

        System.out.println("The biggest element is " + biggestElem + ", and it's index is " + indexOfTheBiggest);

    }
}
