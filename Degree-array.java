class Solution {
    public int findShortestSubArray(int[] nums) {
        int n = nums.length;
        if(n==1)
            return 1;
        int m = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            m = Math.max(mp.get(nums[i]),m);

        }
        int ans = n;
        for(int i=0; i<n; i++)
        {
            Map<Integer,Integer> mp2 = new HashMap<>();
            for(int j=i; j<n; j++)
            {
                mp2.put(nums[j], mp2.getOrDefault(nums[j], 0) + 1);
                if(m==mp2.get(nums[j]))
                {
                    ans = Math.min(ans, j-i+1);
                    break;
                }
            }
        }
        return ans;
    }
}