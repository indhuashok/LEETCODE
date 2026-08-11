// Last updated: 8/11/2026, 11:25:12 AM
class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb=new StringBuilder();
        if(num==0){
            return "0";
        }
        boolean ne=false;
        if(num<0){
            ne=true;
            num= Math.abs(num);
        }
       
        while(num>0){
            sb.append(num%7);
            num=num/7;
        }
        if(ne){
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}