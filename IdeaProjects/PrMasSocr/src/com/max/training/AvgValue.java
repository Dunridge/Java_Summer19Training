package com.max.training;

public class AvgValue
{
    public void avgValue(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        System.out.println("avg is " + sum / arr.length);
    }
}
