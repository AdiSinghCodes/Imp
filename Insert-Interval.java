class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int start = newInterval[0];
        int end = newInterval[1];
        for(int[] interval : intervals)
        {
            int a = interval[0];
            int b = interval[1];

            if(start>b)
            {
                ans.add(new int[]{a,b});
            }
            else if(end < a)
            {
                ans.add(new int[]{start,end});
                start = a;
                end = b;
            }
            else
            {
                start = Math.min(start,a);
                end = Math.max(end,b);
            }
        }
        ans.add(new int[] {start,end});
        return ans.toArray(new int[ans.size()][]);
    }
}