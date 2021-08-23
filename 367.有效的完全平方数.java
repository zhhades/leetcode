/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1){
            return true;
        }
        long left = 1;
        long right = num;
        while(left <= right){
            long mid = left+(right-left)/2;
            if (mid * mid > num){
                right = mid - 1;
            }else if(mid * mid < num){
                left = mid + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

