import java.util.*;

public class Maximal_rectangle{


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        char[][] matrix = new char[rows][columns];
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                matrix[i][j] = sc.next().charAt(0);

            }
        }
        Maximal_rectangle ch = new Maximal_rectangle();
        int fi = ch.maximalRectangle(matrix);
        System.out.println(fi);
    }


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