// Last updated: 8/11/2026, 11:24:59 AM
class Solution {
    public boolean checkRecord(String s) {
        
        int c=0;
        for(char ch:s.toCharArray()){
           if(ch=='A'){
            c++;
           }
           if(c>=2){
            return false;
           }
        }
        // for(int i=0;i<s.length();i++){
        //     int left=0;
        //     int cc=0;

        //     while(s.charAt(left)=='L'){
        //         left++;
        //         if(cc>=3){
        //             return false;
        //         }
        //     }
        // }
        if(s.contains("LLL")){
            return false;
        }
        return true;
    }
}