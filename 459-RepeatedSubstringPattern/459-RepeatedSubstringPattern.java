// Last updated: 8/11/2026, 11:25:21 AM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int i=1;i<=n/2;i++){
            String ans="";
            if(n%i !=0){
                continue;
            }
            String ss=s.substring(0,i);
            int times=n/i;
            for(int j=0;j<times;j++){
                ans+=ss;
            }
            if(ans.equals(s)){
                return true;
            }
        }
        return false;
    }
}