class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = arr.length;
        int m = 1;
        int p = 0;
        int[] ans =  new int[n];
        for(int i=0; i<n; i++)
        {
            ans[i] = arr[i];
        }
        Arrays.sort(arr);
        while(p<n)
        {
            int val = arr[p];
            while(p<n && arr[p] == val)
            {
                mp.put(arr[p], m);
                p++;
            }
            m++;
        }
        for(int i=0; i<n; i++)
        {
            int u = ans[i];
            u = mp.get(u);
            arr[i] = u;
        }

        return arr;


    }
}