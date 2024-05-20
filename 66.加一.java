/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int upgradeFlag = 1;
        int pointer = digits.length - 1;
        while (pointer >= 0) {
            if (upgradeFlag==0) {
                break;
            }
            int val = digits[pointer] + upgradeFlag;
            digits[pointer] = val % 10;
            upgradeFlag = val / 10;
            pointer--;
        }
        if (upgradeFlag == 0) {
            return digits;
        }
        int[] responseArray = new int[digits.length + 1];
        responseArray[0] = 1;
        for (int i = 1; i < responseArray.length; i++) {
            responseArray[i] = digits[i - 1];
        }
        return responseArray;
    }
}
// @lc code=end
