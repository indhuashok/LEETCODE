// Last updated: 8/11/2026, 11:24:04 AM
class Solution {
    public int numberOfSubstrings(String s) {
        int c[]=new int[3];
        int ans=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)-'a']++;
            while(c[0]>0 && c[1]>0 && c[2]>0){
                ans+=(s.length()-i);
                c[s.charAt(left)-'a']--;
                left++;
            }
        }
        return ans;
    }
}