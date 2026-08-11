// Last updated: 8/11/2026, 11:26:23 AM
class Solution {
    public void moveZeroes(int[] arr) {
        int n=arr.length;
        int a[]=new int [n];int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                a[c++]=arr[i];
            }
          
        }
        for(int i=0;i<n;i++){
          arr[i]=a[i];
        }
        System.out.print(arr);
    }
}