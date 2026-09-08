class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] freq= new int[nums.length+1];
        freq[0]=1;
        int odd =0;
        int ans =0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 !=0)
            odd++;
            if(odd>=k)
            ans+=freq[odd-k];
            freq[odd]++;
        }
        return ans;
    }
}