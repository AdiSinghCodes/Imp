class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums[i].length; j++)
            {
                mp.put(nums[i][j], mp.getOrDefault(nums[i][j],0)+1);
            }
        }

        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> en: mp.entrySet())
        {
           int y = en.getValue();
           if(y==n)
           {
              arr.add(en.getKey());
           }
        }
        return arr;
    }
}