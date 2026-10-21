class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftsum=0;
        int rightsum=0;
        for(int i: nums){
            rightsum+=i;
        }
        int[] arr =new int[nums.length];
        for(int j=0;j<nums.length;j++){
            rightsum-=nums[j];
            arr[j]=Math.abs(leftsum-rightsum);
            leftsum+=nums[j];
        }
        return arr;
    }
}