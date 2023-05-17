import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertInBtwArray_P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //for array with new array creation
        /*
        System.out.println("Input size:");
        int size = sc.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        System.out.println("Insert Position:");
        int pos = sc.nextInt();
        System.out.println("Insert element:");
        int val = sc.nextInt();
        int[] ans = insert(arr, pos, val);
        for(int i:ans)
            System.out.println(i+" ");*/


        //for list
        System.out.println("Input size:");
        int size = sc.nextInt();
        List<Integer> arrList= new ArrayList<>();
        for(int i=0;i<size;i++)
            arrList.add(sc.nextInt());
        System.out.println("Insert Position:");
        int pos = sc.nextInt();
        System.out.println("Insert element:");
        int val = sc.nextInt();
        insertList(arrList, pos, val);
        for(int i:arrList)
            System.out.println(i+" ");
    }
    //pos is position not index
    public static int[] insert(int[] arr, int pos, int val){
        int[] ans = new int[arr.length+1];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(i==pos-1)
            {
                ans[j]=val;
                j++;
            }
            ans[j]=arr[i];
            j++;

        }
        return ans;
    }
    public static List<Integer> insertList(List<Integer> arrList, int pos, int val){
        arrList.add(arrList.get(arrList.size()-1)); //special handle for addition index
        for(int i =arrList.size()-2;i>pos-2;i--)
         arrList.set(i+1,arrList.get(i));
     arrList.set(pos-1,val);
     return arrList;
    }
}
