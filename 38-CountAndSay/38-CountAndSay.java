// Last updated: 8/11/2026, 11:28:50 AM
class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
       String res="1";
       for(int i=2;i<=n;i++){
        StringBuilder temp=new StringBuilder();
        int c=1;
        for(int j=1;j<=res.length();j++){
            if(j<res.length() && res.charAt(j)==res.charAt(j-1)){
                c++;
            }else{
                temp.append(c);
                temp.append(res.charAt(j-1));
                c=1;
            }
        }
        res=temp.toString();
       }
       return res;
    }
}