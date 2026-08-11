// Last updated: 8/11/2026, 11:28:05 AM
import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int l=m+n;
        // int sum[]=new int[l];
        // int k=0;
        // for(int i=0;i<m;i++){
          
        //   sum[k]=nums1[i];
        //   k++;
        // }
        //  for(int i=0;i<n;i++){
          
        //   sum[k]=nums2[i];
        //   k++;
        // }
        // Arrays.sort(sum);
        // for (int i = 0; i < l; i++) {
        //     nums1[i] = sum[i];
        // }
        int k=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0 && k<n){
                nums1[i]=nums2[k++];
                
            }
        }
        Arrays.sort(nums1);
        for(int i=0;i<m;i++){
            
            System.out.print(nums1[i]);
        }
    }
}