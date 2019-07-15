package com.max.training;

public class MinIndex
{
    public void minElem(int[] arr)
    {
        int minElem = 100;
        int minIndex = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < minElem)
            {
                minElem = arr[i];
                minIndex = i;
            }
        }

        System.out.println("The smallest element is " + minElem + " and it's index is " + minIndex);
    }
}
