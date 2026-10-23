class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;
        int pow2 =1;
        while(pow2<n) pow2 <<=1;
        int maxK=pow2 -1;
        int k =maxK;
        for(int i=0;i<n;++i){
            if(nums[i] !=i){
                k &=nums[i];
            }
        }
        return (k==maxK) ? 0:k;
    }
}