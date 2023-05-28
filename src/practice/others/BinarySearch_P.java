package practice.others;

import java.util.Scanner;

public class BinarySearch_P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size:");
        int size = sc.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        System.out.println("Element to search:");
        int key = sc.nextInt();
        System.out.println(binarySearch(arr, key));
    }
    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(key == arr[mid])
                return key;
            else if(key < arr[mid])
                high = mid-1;
            else if(key > arr[mid])
                low = mid+1;
        }
        return -1;
    }
}
