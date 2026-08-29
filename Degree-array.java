class Solution {
    public int findShortestSubArray(int[] nums) {

        int n = nums.length;

        Map<Integer, Integer> mp = new HashMap<>();

        // Step 1: Find frequency of each number
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find degree
        int degree = 0;

        for (int freq : mp.values()) {
            degree = Math.max(degree, freq);
        }

        // Step 3: Find first and last occurrence
        // of every number having frequency = degree
        int ans = n;

        for (int key : mp.keySet()) {

            if (mp.get(key) == degree) {

                int first = -1;
                int last = -1;

                for (int i = 0; i < n; i++) {

                    if (nums[i] == key) {

                        if (first == -1) {
                            first = i;
                        }

                        last = i;
                    }
                }

                int length = last - first + 1;
                ans = Math.min(ans, length);
            }
        }

        return ans;
    }
}