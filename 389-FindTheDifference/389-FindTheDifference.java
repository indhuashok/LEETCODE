// Last updated: 8/11/2026, 11:25:51 AM
class Solution {
    public char findTheDifference(String s, String t) {
       
        int a[]=new int[26];
        for(char ch:t.toCharArray()){
           a[ch-'a']++;
        }
        for(char ch:s.toCharArray()){
            a[ch-'a']--;
            
        }
        for(int i=0;i<26;i++){
            if(a[i]==1){
                return (char)(i+'a');
            }
        }
        return ' ';
    }
}