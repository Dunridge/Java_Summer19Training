package com.max.training;

public class SumOfElems
{
    public void sumOfElems(int[] arr)
    {
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
