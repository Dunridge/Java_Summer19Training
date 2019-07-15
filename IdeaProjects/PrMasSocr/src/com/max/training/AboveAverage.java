package com.max.training;

public class AboveAverage
{
    public void findAboveAverege(int[] arr)
    {
        int counterOfBiggerElems = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= averageValue(arr))
            {
                counterOfBiggerElems++;
            }
        }

        System.out.println("Number of bigger elements is " + counterOfBiggerElems);
    }

    public int averageValue(int[] arr)
    {
        int sumOfElems = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sumOfElems += arr[i];
        }

        return sumOfElems/arr.length;
    }
}
