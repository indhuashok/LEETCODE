// Last updated: 8/11/2026, 11:24:42 AM
class Solution {
    public boolean isPalin(String s,int left,int right){
        while(left<right){
          if(s.charAt(left)!=s.charAt(right)){
            return false;
          }
          left ++;
          right --;
        }
      return true;  
    }
       
    //      for(int i=s.length()-1;i>=0;i--){
    //         a+=s.charAt(i);
    //     }
    //     if(a.equals(s)){
    //         return true;
    //     }
    //     return false;
    // }
    public boolean validPalindrome(String s) {
        // String a="";
        // int left=0;
        // int right=s.length-1;
        // for(int i=s.length()-1;i>=0;i--){
        //     a+=s.charAt(i);
        // }
        // if(a.equals(s)){
        //     return true;
        // }
        // return false;
        
         int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return isPalin(s,left+1,right) ||
                       isPalin(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
}