// Last updated: 8/11/2026, 11:24:54 AM
class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder(arr[i]);
            ss.append(sb.reverse());
            if(i != arr.length-1){
                ss.append(" ");
            }
        }
       return ss.toString();
    }
}