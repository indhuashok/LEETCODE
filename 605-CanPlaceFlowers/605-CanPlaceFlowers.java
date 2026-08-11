// Last updated: 8/11/2026, 11:24:49 AM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m=flowerbed.length;
        // if(flowerbed[0]==0 && flowerbed[1]==0){
        //     return true;
        // }
        // for(int i=1;i<m-1;i++){
            
        //     if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0 ){
        //         flowerbed[i]=1;
        //         n--;
        //     }
        // }
        // if(n==0){
        //     return true;
        // }
        // return false;

        int c=0;
        for(int i=0;i<m && c<=n;i++){
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0)&& (i==m-1 || flowerbed[i+1]==0)){
                c++;
                i++;
            }
        }
        if(c>=n){
            return true;
        }
        return false;
    }
}