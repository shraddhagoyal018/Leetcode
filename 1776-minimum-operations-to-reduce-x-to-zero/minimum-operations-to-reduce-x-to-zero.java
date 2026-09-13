class Solution {
    public int minOperations(int[] nums, int x) {

        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int target = total - x;

        if (target < 0) {
            return -1;
        }

        if (target == 0) {
            return nums.length;
        }

        int l = 0;
        int sum = 0;
        int maxLength = -1;

        for (int r = 0; r < nums.length; r++) {

            sum += nums[r];
            while(sum> target && l <=r){
                sum -= nums[l];
                l++;
            }
            if( sum == target){
                maxLength = Math.max(maxLength,r-l+1);
            }
        }
        if(maxLength==-1){
            return -1;
        }
        return nums.length - maxLength;
    }
}