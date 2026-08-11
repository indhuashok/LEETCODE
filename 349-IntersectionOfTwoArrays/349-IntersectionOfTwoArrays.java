// Last updated: 8/11/2026, 11:26:06 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // int in=0;
        //  for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(nums1[i]==nums2[j]){
        //             arr[in++]=nums1[i];
        //         }
        //          break;
        //     }
        //  }
      HashSet<Integer>a=new HashSet<>();
        HashSet<Integer>res=new HashSet<>();
        for(int i:nums1){
            a.add(i);
        }
        for(int i:nums2){
            if(a.contains(i)){
                res.add(i);
            }
        }
        int aa[]=new int[res.size()];
        int i=0;
        for(int in:res){
            aa[i++]=in;
        }
        return aa;
    }
}