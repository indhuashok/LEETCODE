// Last updated: 8/11/2026, 11:25:05 AM
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==0){
            return false;
        }
        // int ac=0;
        // int fc=0;
        // int as=0;
        
        // for(int i=0;i<word.length();i++){
            
        //     if(Character.isUpperCase(word.charAt(i))){
                
        //         ac++;
        //     }else if(Character.isLowerCase(word.charAt(i))){
        //         as++;
        //     }else{
        //        String s=word.substring(0,1);
        //       if(Character.isUpperCase(s.charAt(0))){
        //         String ss=word.substring(1,word.length()-1);
        //          int a=0;
        //          for(int j=0;j<ss.length();j++){
        //             if(Character.isUpperCase(ss.charAt(j))){
        //                 a++;
        //             }
        //          }
        //          if(a==ss.length()){
        //             return true;
        //          }
        //       }
        //     }
        // }
        // if(ac ==word.length() || as==word.length()){
        //     return true;
        // }
        // return false;

        int upper=0;
        for(int i=0;i<word.length();i++){
           if(Character.isUpperCase(word.charAt(i))){
            upper++;
           }
        }
        if(upper==word.length()){
            return true;
        }
        if(upper==0){
            return true;
        }
        if(upper ==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;

    }
}