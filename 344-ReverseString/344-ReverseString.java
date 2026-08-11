// Last updated: 8/11/2026, 11:26:13 AM
class Solution {
    public void reverseString(char[] s) {
        // char ch[];
        // int j=0;
        // for(int i=s.length-1;i>=0;i--){
        //      ch[j]=s[i];
        //      j++;
        // }
        // return ch[];
        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}