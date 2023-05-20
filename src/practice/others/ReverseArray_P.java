package practice.others;

import java.util.Scanner;

public class ReverseArray_P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size:");
        int size = sc.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        reverseArray(arr);
        for(int i:arr)
            System.out.println(i+" ");
    }
    public static void reverseArray(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }

}
