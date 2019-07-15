package com.max.training;

public class NullEven
{
    public void nullEven(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
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
