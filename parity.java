class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] even = new int[n/2];
        int[] odd = new int[n/2];
        int m = 0;
        int y = 0;
        for(int i=0; i<n; i++)
        {
            if(nums[i]%2==0)
            {
                even[m++] = nums[i];
            }
            else
            {
                odd[y++] = nums[i];
            }
        }
        m = 0;
        y = 0;
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                nums[i] = even[m++];
            }
            else
            {
                nums[i] = odd[y++];
            }
        }
        return nums;
    }
}