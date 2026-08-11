// Last updated: 8/11/2026, 11:25:53 AM
class Solution {
    public int firstUniqChar(String s){
    Map<Character,Integer>m=new HashMap<>();
    for(char ch:s.toCharArray()){
        m.put(ch,m.getOrDefault(ch,0)+1);
    }
    // for(char ch:m.keySet()){
    //     if(m.get(ch)==1){
    //         return ch;
    //     }
    //}
    for(int i=0;i<s.length();i++){
        if(m.get(s.charAt(i))==1){
            return i;
        }
    }
    return -1;
    }
}