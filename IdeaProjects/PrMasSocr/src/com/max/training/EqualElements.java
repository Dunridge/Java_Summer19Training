package com.max.training;

public class EqualElements
{
    public void findEqualElems(int[] arr)
    {

        for(int i = 0; i < arr.length; i++)
        {
            for(int k = 0; k < arr.length; k++)
            {
                if(arr[k] == arr[i] && k != i)
                {
                    System.out.print(arr[k] + " ");
                }
            }
        }
    }
}
