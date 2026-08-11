// Last updated: 8/11/2026, 11:29:37 AM
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int original = x;   
        int reversed = 0;

        while (x > 0) {
            int r = x % 10;            
            reversed = reversed * 10 + r;  
            x = x / 10;                
        }

        return original == reversed;
    }
}
