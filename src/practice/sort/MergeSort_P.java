package practice.sort;

import java.util.Scanner;

public class MergeSort_P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size:");
        int size = sc.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        mergeSort(arr,0,arr.length-1);
        for(int i:arr)
            System.out.print(i+" ");
    }
    public static void mergeSort(int[] arr, int start, int end) {
        if(start<end)
        {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }
    public static void merge(int[] arr, int start, int mid, int end) {
        int i, j, k;
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] larr = new int[n1];
        int[] rarr = new int[n2];

        for (i = 0; i < n1; i++)
            larr[i] = arr[start + i];
        for (j = 0; j < n2; j++)
            rarr[j] = arr[mid + 1 + j];

        i = 0;
        j = 0;
        k = start;
        while (i < n1 && j < n2) {
            if (larr[i] <= rarr[j]) {
                arr[k] = larr[i];
                i++;
                k++;
            } else {
                arr[k] = rarr[j];
                j++;
                k++;
            }
        }
        while (i < n1) {
            arr[k] = larr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }
}
