class Transfer {
    public int[] constructTransformedArray(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int n = nums[i];

            if (n == 0) {
                result[i] = n;
            }

            else if (n > 0) {

                int newindex = (i + n) % nums.length;
                result[i] = nums[newindex];

            }

            else {

                if (Math.abs(n) > nums.length) {

                    int newindex =
                        (i - (Math.abs(n) % nums.length) + nums.length)
                        % nums.length;

                    result[i] = nums[newindex];
                }

                else {

                    int newindex =
                        (i - Math.abs(n) + nums.length) % nums.length;

                    result[i] = nums[newindex];
                }
            }
        }

        return result;
    }
}