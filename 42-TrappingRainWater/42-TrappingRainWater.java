// Last updated: 8/14/2026, 1:40:16 PM
1class Solution {
2    public int trap(int[] arr) {
3        int left=0;
4        int right=arr.length-1;
5        int lmax=0;
6        int rmax=0;
7        int water=0;
8        while(left<right){
9            if(arr[left]<=arr[right]){
10                if(arr[left]>=lmax){
11                    lmax=arr[left];
12                }else{
13                    water+=lmax-arr[left];
14                }
15                 left++;
16            }  
17        else{
18            if(arr[right]>=rmax){
19                rmax=arr[right];
20            }else{
21                water+=rmax-arr[right];
22            }
23             right--;
24        }
25       
26        }
27        return water;
28    }
29}