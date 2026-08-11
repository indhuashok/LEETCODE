// Last updated: 8/11/2026, 11:27:13 AM
class Solution {
    public int countPrimes(int n) {
        int c=0;
        if(n<2){
            return 0;
        }
        boolean isPrime[]=new boolean [n];
        for(int i=2;i<n;i++){
            isPrime[i]=true;
        }
        for(int i=2;i*i<n;i++){
         if(isPrime[i]){
            for(int j=i*i;j<n;j+=i){
                isPrime[j]=false;
            }
         }
        }
         for(int i=2;i<n;i++){
            if(isPrime[i]){
                c++;
            }
         }
    //     for(int i=2;i<n;i++){
    //         if(isPrime(i)){
    //             c++;
    //         }
    //     }
    //     return c;
    // }
    // public static boolean isPrime(int n){
    //     if(n<2){
    //         return false;
    //     }
    //     for(int j=2;j<=Math.sqrt(n);j++){
    //         if(n%j ==0){
    //             return false;
    //         }
    //     }
    //     return true;
    return c;
    }
}