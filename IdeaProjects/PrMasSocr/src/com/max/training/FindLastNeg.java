package com.max.training;

public class FindLastNeg
{
    public void findLastNeg(int[] arr)
    {
        int lastNeg = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < 0)
            {
                lastNeg = arr[i];
            }
        }

        System.out.println("Last negative number is " + lastNeg);
    }
}
