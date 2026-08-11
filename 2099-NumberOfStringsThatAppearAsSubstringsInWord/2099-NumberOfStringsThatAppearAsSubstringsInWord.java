// Last updated: 8/11/2026, 11:23:49 AM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
    //     int c=0;
    //     for(String s:patterns){
    //         boolean f=false;
    //     for(int i=0;i<word.length();i++){
    //         for(int j=i+1;j<=word.length();j++){
    //             if(s.equals(word.substring(i,j))){
    //                 c++;
    //                 f=true;
    //                 break;
    //             }
    //         }
    //     }
    //  }
        
    //     return c;

        int count = 0;

        for (String s : patterns) {
            if (word.contains(s)) {
                count++;
            }
        }

        return count;
    
    }
}