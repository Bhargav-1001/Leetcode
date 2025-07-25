class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (first >= nums[i]) {
                first = nums[i];
            } else if (second >= nums[i]) {
                second = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }
}