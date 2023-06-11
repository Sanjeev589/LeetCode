package practice.striver;

public class RemoveDuplicatesFromSortedArr {
    int remove_duplicate(int A[],int N){
        // code here
        int x=0, y=0;
        for(int i=1;i<N;i++){
            if(A[i]!=A[i-1]){
                x++;
                A[x] = A[i];
            }
        }
        return x+1;
    }
}
