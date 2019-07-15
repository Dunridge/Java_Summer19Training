package com.max.training;

public class ShiftToTheRight
{
    // Циклический сдвиг элементов массива на k- позиций вправо
    public void shiftToTheRight(int[] arr, int n)
    {
        // shift with k to the right
        //Rotate the given array by n times toward right
        for(int i = 0; i < n; i++){
            int j, last;
            //Stores the last element of array
            last = arr[arr.length-1];

            for(j = arr.length-1; j > 0; j--){
                //Shift element of array by one
                arr[j] = arr[j-1];
            }
            //Last element of array will be added to the start of array.
            arr[0] = last;
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
