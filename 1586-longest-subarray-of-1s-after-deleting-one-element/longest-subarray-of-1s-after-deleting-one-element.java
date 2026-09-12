class Solution {
    public int longestSubarray(int[] nums) {
      int l=0;
      int ze=0;
      int ans=0;
      for(int r=0;r<nums.length;r++){
        if(nums[r]==0){
            ze++;
        }
        while(ze>1){
            if(nums[l]==0){
                ze--;
            }
            l++;
        }
        ans=Math.max(ans,r-l);
      }  
      return ans;
    }
}