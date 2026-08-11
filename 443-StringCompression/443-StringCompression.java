// Last updated: 8/11/2026, 11:25:34 AM
class Solution {
    public int compress(char[] chars) {
        // LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        // for(char c:chars){
        //     map.put(c,map.getOrDefault(c,0)+1);
        // }
        //     String s="";
        //     for(Map.Entry<Character,Integer>entry:map.entrySet()){
        //         if(entry.getValue()!=1){
        //             s+=(entry.getKey());
        //             s+=(entry.getValue());
        //         }else{
        //            s+=(entry.getKey());
        //         }
        //     }
        //     return s.length();
        // int a[]=new int[26];
        // StringBuilder sb=new StringBuilder();
        // for(int i=0;i<chars.length;i++){
        //     if(chars[i]==chars[i+1]){
        //     a[chars[i]-'a']++;
        //     }else{
        //           sb.append(chars[i]);
        //           sb.append(a[i]);
        //           a[i]=0;
        //     }
        // }
        // return sb.toString();
        int in=0;
        int i=0;
        while(i<chars.length ){
            char curr=chars[i];
            int c=0;
            while( i<chars.length && chars[i]==curr ){
                c++;
                i++;
            }
            chars[in++]=curr;
            if(c>1){
               String ss=String.valueOf(c);
                for(char cc:ss.toCharArray()){
                    chars[in++]=cc;
                }
            }
        }
        return in;
    }
}