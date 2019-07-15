package com.max.training;

public class NullCount
{
    public void countNulls(int[] arr)
    {
        int numOfNulls = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 0)
            {
                numOfNulls++;
            }
        }

        System.out.println("Num of nulls: " + numOfNulls);
    }
}
