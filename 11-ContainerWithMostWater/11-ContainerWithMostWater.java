// Last updated: 8/11/2026, 11:29:35 AM
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            int width=right-left;
            int hi=Math.min(height[left],height[right]);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
            max=Math.max(max,hi*width);

        }
        return max;
    }
}