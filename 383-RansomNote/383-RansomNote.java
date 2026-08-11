// Last updated: 8/11/2026, 11:25:55 AM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        // if(magazine.contains(ransomNote)){
        //     return true;
        // }
        // return false;
        
        int a[]=new int[26];
        for(char ch:magazine.toCharArray()){
            a[ch-'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            a[ch-'a']--;
            if(a[ch-'a']<0){
                return false;
            }
        }
        return true;
    }
}