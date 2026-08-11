// Last updated: 8/11/2026, 11:26:34 AM
class Solution {
    public int addDigits(int n) {
        int s = 0;
        // Repeat the digit-sum process until n is a single digit
        while (n >= 10) {
            s = 0;                // reset sum for this pass
            while (n > 0) {
                s += n % 10;
                n = n / 10;
            }
            n = s;                // assign sum back to n for next pass
        }
        return n;                 // now n is a single digit
    }
}
