class Solution {
    public int removeElement(int[] nums, int val) {
        int[] arr = new int[nums.length];
        int y = 0;
        int c = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=val)
            {
                y++;
                arr[c++] = nums[i];
            }
        }
        c = 0;
        for(int j=0; j<nums.length; j++)
        {
            if(c!=y)
            {
                c++;
                 nums[j] = arr[j];
            }
            else
            {
                nums[j] = val;
            }
           

        }
        return y;
    }
}