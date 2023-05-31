public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i, j, k = m+n-1;
        for(i = m-1,  j = nums2.length-1;i>=0 && j>=0; k--){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
        }
        while(i >=0){
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while(j >=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }

    }
}
