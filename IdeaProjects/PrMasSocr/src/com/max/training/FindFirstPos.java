package com.max.training;

public class FindFirstPos
{
    public void findFirstPos(int[] arr)
    {
        int firstPosElem = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 0)
            {
                firstPosElem = arr[i];
                break;
            }
        }

        System.out.println("First positive number: " + firstPosElem);
    }
}
