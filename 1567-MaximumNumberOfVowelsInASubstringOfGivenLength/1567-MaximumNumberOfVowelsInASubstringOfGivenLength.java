// Last updated: 8/11/2026, 11:24:03 AM
class Solution {
    public static boolean isVowel(char c){
        if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        // for(int i=0;i<=s.length()-k;i++){
        //      int c=0;
        //     for(int j=i;j<i+k;j++){
        //         if(s.charAt(j)=='a'|| s.charAt(j)=='e'|| s.charAt(j)=='i' || s.charAt(j)=='o'||
        //         s.charAt(j)=='u'){
        //             c++;
        //         }
        //     }
        //          max=Math.max(max,c);
            
           
        // }
        // return max;
        
        int c=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                c++;
            }
        }
       int max=c;
        for(int i=k;i<s.length();i++){
          if(isVowel(s.charAt(i))){
                c++;
            }
            if(isVowel(s.charAt(i-k))){
                c--;
            }
            max=Math.max(max,c);
        }
        return max;
    }
}