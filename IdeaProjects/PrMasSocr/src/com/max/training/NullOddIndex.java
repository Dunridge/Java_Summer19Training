package com.max.training;

public class NullOddIndex
{
    public void nullOddIndex(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(i % 2 == 1)
            {
                arr[i] = 0;
            }
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
