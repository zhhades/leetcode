/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int fib(int n) {
        if(n < 1 ){
            return 0;
        }
        Map<Integer,Integer> map =new HashMap<>();
        return helper(map, n);
    }

    public int helper(Map<Integer,Integer> tmpMap,int n ){
        if(n == 1 || n==2){
            return 1;
        }
        if (null!= tmpMap.get(n)){
            return tmpMap.get(n);
        }
        tmpMap.put(n, helper(tmpMap, n-1)+helper(tmpMap, n-2));
        return tmpMap.get(n);
    }
}
// @lc code=end

