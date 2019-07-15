package com.max.training;

public class MulByNum
{
    public void mulByNum(int[] arr, int num)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = arr[i] * num;
        }

        printArr(arr);
    }

    public void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
