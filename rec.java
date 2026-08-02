class Solution {
    public int maximalRectangle(char[][] matrix) {
        int maxarea = 0;

        int m = matrix[0].length;
        int[] height = new int[m];
        for(char[] row : matrix)
        {
            for(int i=0; i<m; i++)
            {
                if(row[i] == '1')
                {
                    height[i]++;
                }
                else
                {
                    height[i] = 0;
                }
            }
            maxarea = Math.max(maxarea, largest(height));


            
        }
        return maxarea;
    }


    public int largest(int[] height)
    {
        Stack<Integer> st = new Stack<>();
        int[] newarr = Arrays.copyOf(height, height.length+1);
        int maxarea = 0;
        for(int i=0; i<newarr.length; i++)
        {
            while(!st.isEmpty() && newarr[i] < newarr[st.peek()])
            {
                int heights = newarr[st.pop()];
                int width = st.isEmpty() ? i : i-st.peek()-1;
                maxarea = Math.max(maxarea, heights * width);
            }
            st.push(i);
        }
        return maxarea;
    }
}