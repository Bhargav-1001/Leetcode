class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;

        int actualSum = (range * (range+1))/2;
        int currentSum = 0;
        for(int i = 0 ; i < range ; i++){
            currentSum += nums[i];
        }

        int ans = actualSum - currentSum;

        return ans;
    }
}