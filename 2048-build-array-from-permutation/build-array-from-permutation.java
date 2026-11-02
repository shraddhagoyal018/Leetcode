class Solution {
    public void solve(int[] nums, int[] a, int i) {
        if (i == nums.length) {
            return;
        }
        a[i] = nums[nums[i]];
        solve(nums, a, i + 1);
    }
    public int[] buildArray(int[] nums) {
        int[] a = new int[nums.length];
        solve(nums, a, 0);
        return a;
    }
}