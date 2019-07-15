package com.max.training;

public class NotEqualElements
{
    // Вывести элементы, значения которых не равны значениям других элементов.
    public void findNotEqualElements(int[] arr)
    {
        int numberOfNotEqual = 0;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if (i != j)
                {
                    if (arr[i] != arr[j])
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag == true)
            {
                numberOfNotEqual++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
