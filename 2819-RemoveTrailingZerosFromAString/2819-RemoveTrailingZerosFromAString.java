// Last updated: 8/11/2026, 11:23:00 AM
class Solution {
    public String removeTrailingZeros(String num) {
        //StringBuilder sb=new StringBuilder();
        int right=num.length()-1;
        
        
            while(num.charAt(right)=='0'){
                 right--;
            }
        
            // String s="";
            // for(int i=0;i<=right;i++){
            //     s+=num.charAt(i);
            // }
        
        return num.substring(0,right+1);
    }
}