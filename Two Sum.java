/*
https://leetcode.com/problems/two-sum/
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        /*brute-force
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j] == target - nums[i])
                {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}*/
        //suppose 6+6 is there. in brute force it always checks second element from j=i+1 but in map it might take the same element twice, so in map we check map.get(c)!=i.
        //hash-map - 2 pass
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int c = target-nums[i];
            if(map.containsKey(c) && map.get(c)!=i) //ensuring that the complement is not referring to the same index i.e. same element itself.
            {
                return new int[] {i,map.get(c)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}