package com.max.training;

public class MoreZeroCount
{
    public void moreZeroCount(int[] arr)
    {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 0)
            {
                count++;
            }
        }

        System.out.println("The number of numbers more than zero is " + count);
    }
}
