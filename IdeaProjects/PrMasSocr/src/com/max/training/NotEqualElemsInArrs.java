package com.max.training;

public class NotEqualElemsInArrs
{
    //Вывести элементы одного массива, которые не равны элементам второго
    //массива.
    public void findNotEqualElemsInArrs(int[] arr1, int[] arr2)
    {
        for(int i = 0; i < arr1.length; i++)
        {
            int j;

            for(j = 0; j < arr2.length; j++)
                if(arr1[i] == arr2[j])
                    break;

            if(j==arr2.length)
                System.out.println(arr1[i] + " ");
        }
    }
}
