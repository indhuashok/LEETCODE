// Last updated: 8/11/2026, 11:29:51 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int arr[]=new int[m+n];
        int a=0;
        for(int i=0;i<m;i++){
            arr[a++]=nums1[i];
        }
       
        for(int i=0;i<n;i++){
            arr[a++]=nums2[i];
        }
        double ans=0.0;
        Arrays.sort(arr);
        if(arr.length %2==1){
            ans=(double)(arr[arr.length/2]);
        }else{
            int an=arr[arr.length/2];
            int ns=arr[(arr.length/2)-1];
            ans=(double)((an+ns)/2.0);
        }
        return ans;
    }
}