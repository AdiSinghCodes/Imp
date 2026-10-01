class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp1 = new HashMap<>();
        Map<Integer,Integer> mp2 = new HashMap<>();

         for(int i=0; i<nums1.length; i++)
         {
            mp1.put(nums1[i], mp1.getOrDefault(nums1[i], 0) + 1);
         }

          for(int i=0; i<nums2.length; i++)
         {
            mp2.put(nums2[i], mp2.getOrDefault(nums2[i], 0) + 1);
         }
        ArrayList<Integer> result = new ArrayList<>();
        for(int num : mp1.keySet())
        {
            if(mp2.containsKey(num))
            {
                int count  = Math.min(mp1.get(num), mp2.get(num));
                for(int i=0; i<count; i++)
                {
                    result.add(num);
                }
            }
        }

        int[] ans = new int[result.size()];
        for(int i=0; i<ans.length;i++)
        {
            ans[i] = result.get(i);
        }

        return ans;

    }
}