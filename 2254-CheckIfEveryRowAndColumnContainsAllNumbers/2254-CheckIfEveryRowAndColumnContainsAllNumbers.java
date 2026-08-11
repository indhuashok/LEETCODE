// Last updated: 8/11/2026, 11:23:37 AM
class Solution {
    public boolean checkValid(int[][] arr) {
        int n=arr.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=0;j<n-1;j++){
        //        if(arr[i][j]==arr[i][j+1]) {
        //         return false;
        //        }
        //         if(arr[j][i]==arr[j+1][i]) {
        //         return false;
        //        }
               
        //     }

        // }
        // return true;
        for(int i=0;i<n;i++){
            boolean vi[]=new boolean[n+1];
            for(int j=0;j<n;j++){
                int num=arr[i][j];
                if(vi[num]){
                    return false;
                }
                vi[num]=true;
            }
        }
         for(int j=0;j<n;j++){
            boolean vi[]=new boolean[n+1];
            for(int i=0;i<n;i++){
                int num=arr[i][j];
                if(vi[num]){
                    return false;
                }
                vi[num]=true;
            }
        }
      return true;
    }
}