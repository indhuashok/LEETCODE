// Last updated: 8/11/2026, 11:25:22 AM
class Solution {
    // public int ggcd(int a,int b){
    //     while(b!=0){
    //         int t=b;
    //         b=a%b;
    //         a=t;
    //     }
    //     return a;
    // }
    // public int gcd(int arr1[],int arr2[]){
    //     int res=arr1[0];
    //     for(int i=1;i<arr1.length;i++){
    //         res=ggcd(res,arr1[i]);
    //     }
    //     for(int i=0;i<arr2.length;i++){
    //         res=ggcd(res,arr2[i]);
    //     }
    //     return res;
    // }
     public int findContentChildren(int[] g, int[] s) {
    //     if(g.length ==0 || s.length==0){
    //         return 0;
    //     }
    //     return (gcd(g,s));
    Arrays.sort(g);
    Arrays.sort(s);
    int i=0,j=0;
    while(i<g.length && j<s.length){
        if(s[j]>=g[i]){
            i++;
        }
        j++;
    }
    return i;
    }
}