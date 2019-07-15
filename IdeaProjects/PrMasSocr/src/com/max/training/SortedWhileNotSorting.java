package com.max.training;

public class SortedWhileNotSorting
{

    public static int[] merge(int[] a, int[] b) {
        int[] answer = new int[a.length + b.length];
        int i = a.length - 1, j = b.length - 1, k = answer.length;

        while (k > 0)
            answer[--k] =
                    (j < 0 || (i >= 0 && a[i] >= b[j])) ? a[i--] : b[j--];
        return answer;
    }

    //Из двух отсортированных массивов сделать третий отсортированный, не
    //сортируя его.
    //ambiguous???
    public void sortWhileNotSorting(int[] arr1, int[] arr2)
    {
        int[] answer = new int[arr1.length + arr2.length];
        int i = arr1.length - 1, j = arr2.length - 1, k = answer.length;

        while (k > 0)
            answer[--k] =
                    (j < 0 || (i >= 0 && arr1[i] >= arr2[j])) ? arr1[i--] : arr2[j--];

        for(int l = 0; l < answer.length; l++)
        {
            System.out.print(answer[l] + " ");
        }
    }
}
