/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x==1){
            return x;
        }
        long res = x;
        while(res*res > x){
            res = (res + x/res) / 2;
        }
        return (int)res;
    }
}
// @lc code=end

