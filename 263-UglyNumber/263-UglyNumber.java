// Last updated: 8/11/2026, 11:26:31 AM
class Solution {
    // public boolean isPrime(int n){
    //    boolean f=false;
    // for(int i=2;i<n;i++){
    //     if(n%i ==0){
    //         System.out.println(i);
    //         if(i==2 || i==3 ||i ==5){
    //             f=true;
    //         }else{
    //             f=false;
    //         }
    //     }
    // }
    // return f;
    // }
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        else {
           while(n%2==0){
            n=n/2;
           }
           while(n%3==0){
            n=n/3;
           }
           while(n%5==0){
            n=n/5;
           }
           }
           if(n==1){
            return true;
           }else{
            return false;
           }
    }
}