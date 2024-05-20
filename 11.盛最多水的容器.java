/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            max = Math.max(max, (right - left) * Math.min(leftHeight, rightHeight));
            if (height[right] <= height[left]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}
// @lc code=end
