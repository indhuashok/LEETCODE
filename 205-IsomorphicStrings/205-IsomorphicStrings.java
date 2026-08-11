// Last updated: 8/11/2026, 11:27:09 AM
class Solution {
    public boolean isIsomorphic(String s, String t) {
    //    int c=0;
    //     int cc=0;
    //     int a=0;
    //     int aa=0;
    //     for(int i=0;i<s.length();i++){
    //         if(Character.isLetter(s.charAt(i))){
    //             if(i<s.length()-1 && (s.charAt(i))==(s.charAt(i+1))){
    //                 a++;
    //             }
    //             c++;
    //         }
    //     }
    //     for(int i=0;i<t.length();i++){
    //         if(Character.isLetter(t.charAt(i))){
               
    //             if(i<t.length()-1 && (t.charAt(i))==(t.charAt(i+1))){
    //                 aa++;
    //             }
    //             cc++;
    //         }
    //     }
        
    //     if(a!=aa){
    //         return false;
    //     }else if(c == cc){
    //         return true;
    //     }else{
    //         return false;
    //     }
    HashMap<Character,Character>map=new HashMap<>();
    HashMap<Character,Character>rev=new HashMap<>();
    for(int i=0;i<s.length();i++){
       char c=s.charAt(i);
       char cc=t.charAt(i);
       if(map.containsKey(c)){
        if(map.get(c)!=cc){
            return false;
        }
        }else{
          map.put(c,cc);
        }
       
      if(rev.containsKey(cc)){
        if(rev.get(cc)!=c){
            return false;
        }
        }else{
          rev.put(cc,c);
        }
       
    }
    return true;
    }
}