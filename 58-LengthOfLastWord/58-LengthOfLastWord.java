// Last updated: 8/11/2026, 11:28:32 AM
class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
       String ss[]=s.split(" ");
       for(int i=ss.length-1;i>=0;i--){
         for(int j=0;j<ss[i].length();j++){
            len++;
            
         }
         break;
       }
       return len;
    }
}