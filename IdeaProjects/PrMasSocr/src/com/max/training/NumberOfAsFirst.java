package com.max.training;

public class NumberOfAsFirst
{
    public void findNumberOfAsFirst(int[] arr)
    {
        int firstElem;
        int counterOfElems = 0;
        firstElem = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(firstElem == arr[i])
            {
                counterOfElems++;
            }
        }

        System.out.println("There are " + counterOfElems + " elements with the same value as the first one");

    }
}
