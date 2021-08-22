/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int length = nums.length;
        for(int i=0;i<length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<length;i++){
            Integer right = map.get(target-nums[i]);
            if(right != null && right != i){
                return new int[]{i,right};
            }
        }
        return new int[2];
    }
}
// @lc code=end

