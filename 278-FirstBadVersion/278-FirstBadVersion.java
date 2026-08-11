// Last updated: 8/11/2026, 11:26:24 AM
public class Solution extends VersionControl {

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {

                right = mid;

            } else {

                left = mid + 1;
            }
        }

        return left;
    }
}