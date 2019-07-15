package com.max.training;

public class NumberOfElemsEqualTo
{
    public void numberOfElemsEqualTo(int[] arr, int target)
    {
        int numberOfElemsEqualTo = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                numberOfElemsEqualTo++;
            }
        }

        System.out.println("The number of elements equal to " + target + " is " + numberOfElemsEqualTo);
    }
}
