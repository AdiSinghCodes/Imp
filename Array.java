class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0; i<nums.length; i++)
        {
            ans[i] = nums[i];
        }
        int m = nums.length-1;
        for(int i=nums.length; i<ans.length; i++)
        {
            ans[i] = nums[m--];
        }
        return ans;
        
    }
}