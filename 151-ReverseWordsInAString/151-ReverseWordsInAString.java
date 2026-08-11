// Last updated: 8/11/2026, 11:27:31 AM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String ss="";
        String arr[]=s.split("\\s+");
        for(int i=arr.length-1;i>=0;i--){
            ss+=arr[i];
            if(i!=0){
                ss+=" ";
            }
           
        }
        return ss;
    }
}