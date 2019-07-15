package com.max.training;

import java.util.Arrays;

public class CheckForAscension
{
    public void checkForAscension(int[] arr)
    {
        int detAscension = 0;

        for(int i = 0; i < arr.length - 1; i++)
        {
            // arr = [1, 2, 3, 4]
            // (0,1,2,3)
            if(arr[i] <= arr[i+1])
            {
                detAscension += 1;
            }

        }

        if(arr[arr.length - 1] >= arr[arr.length - 2])
        {
            detAscension += 1;
        }

        if(detAscension  == arr.length)
        {
            System.out.println("The array is in ascension");
        }
        else if (detAscension != arr.length)
        {
            System.out.println("The array is not in ascension");
        }

    }
}
