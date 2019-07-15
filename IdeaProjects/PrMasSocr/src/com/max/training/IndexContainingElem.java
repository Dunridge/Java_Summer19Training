package com.max.training;

public class IndexContainingElem
{
    public void indexContainingElem(int[] arr, int target)
    {
        int indexThatContains = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                indexThatContains = i;
            }
        }

        System.out.println("The index of the element that the array contains is " + indexThatContains);
    }
}
