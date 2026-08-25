class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0;
        int zi = 0;
        int max =0 ;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                zi++;
            }
            while(zi>k){
                if(nums[left]==0){
                    zi--;
                }
                left++;
            }
            max=Math.max(max,r-left+1);

        }
        return max;
    }
}