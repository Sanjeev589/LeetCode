package practice.sort;

import java.util.Scanner;

public class SelectionSort_P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size:");
        int size = sc.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        selectionSort(arr);
        for(int i:arr)
            System.out.println(i+" ");
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min_ind = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_ind])
                    min_ind = j;
            }
            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;

        }
    }
}
