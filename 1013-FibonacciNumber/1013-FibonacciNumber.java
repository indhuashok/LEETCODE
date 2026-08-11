// Last updated: 8/11/2026, 11:24:19 AM
class Solution {
    public int fib(int n) {
         int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<=n;i++){
            a=b;
            b=c;
            c=a+b;
        }
        return c;
    }
}