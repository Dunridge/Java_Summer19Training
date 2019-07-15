package com.max.training;

public class CheckForDescent
{
    public void checkForDescent(int[] arr)
    {
        int detDescent = 0;

        for(int i = 0; i < arr.length - 1; i++)
        {
            // arr = [1, 2, 3, 4]
            // (0,1,2,3)
            if(arr[i] > arr[i+1])
            {
                detDescent += 1;
            }

        }

        if(arr[arr.length - 1] < arr.length - 2)
        {
            detDescent += 1;
        }

        if(detDescent  == arr.length)
        {
            System.out.println("The array is in descent");
        }
        else if (detDescent != arr.length)
        {
            System.out.println("The array is not in descent");
        }

    }
}
