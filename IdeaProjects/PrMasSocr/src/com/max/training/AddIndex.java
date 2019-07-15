package com.max.training;

public class AddIndex
{
    public void addIndex(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = arr[i] + i;
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
