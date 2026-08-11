// Last updated: 8/11/2026, 11:25:48 AM
class Solution {

    // String ans = "";

    // public void expand(String s, int left, int right) {

    //     while(left >= 0 &&
    //           right < s.length() &&
    //           s.charAt(left) == s.charAt(right)) {

    //         String curr = s.substring(left, right + 1);

    //         if(curr.length() > ans.length()) {
    //             ans = curr;
    //         }

    //         left--;
    //         right++;
    //     }
    // }

    public int longestPalindrome(String s) {

        // for(int i = 0; i < s.length(); i++) {

        //     expand(s, i, i);      
        //     expand(s, i, i + 1); 
        // }

        // return ans.length();
        int arr[]=new int[128];
        for(char ch:s.toCharArray()){
            arr[ch]++;
        }
        int len=0;
        boolean odd=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                len+=arr[i];
            }else{
                odd=true;
                len+=arr[i]-1;
            }
        }
        if(odd){
            len++;
        }
        return len;
    }
}