// Last updated: 8/11/2026, 11:25:37 AM
class Solution {
    public int countSegments(String s) {
        if(s.length()==0){
            return 0;
        }
        s=s.trim();
        String []arr=s.split("\\s+");
        if(s.isEmpty()){
            return 0;
        }
        return arr.length;
    }
}