// Last updated: 8/11/2026, 11:27:45 AM
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String a="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (Character.isLetter(c)|| Character.isDigit(c)){
                a+=c;
            }
        }
        String aa="";
        for(int i=a.length()-1;i>=0;i--){
            aa+=a.charAt(i);
        }
        if(aa.equals(a)){
            return true;
        }else{
            return false;
        }
    }
}