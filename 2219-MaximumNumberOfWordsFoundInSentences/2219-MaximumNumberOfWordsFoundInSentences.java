// Last updated: 8/11/2026, 11:23:46 AM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String num:sentences){
            int c=1;
            for(int i=0;i<num.length();i++){
                if(num.charAt(i)==' '){
                    c++;
                }
            }
            max=Math.max(max,c);
        }
        return max;
    }
}