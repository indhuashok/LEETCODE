// Last updated: 8/11/2026, 11:25:01 AM
class Solution {
    public String reverseStr(String s, int k) {
        char arr[]=s.toCharArray();
        int n=arr.length;
    //     StringBuilder ss=new StringBuilder();
    //     for(int i=1;i<=n;i++){
    //         if(i<=k){
    //             ss.append(s.charAt(i));
    //         }
    //     }
    //    String a=ss.reverse().toString();
    //     String ans="";
    //     for(int i=k+1;i<n;i++){
    //         ans+=s.charAt(i);
    //     }
    //     return (a+ans);
    for(int i=0;i<n;i+=2*k){
        int left=i;
        int right=Math.min(i+k-1,n-1);
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    return new String(arr);
    }
}