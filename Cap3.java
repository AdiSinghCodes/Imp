
import java.util.*;

public class Cap3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        List<Integer> arr = new ArrayList<>();

        int left = 0;
        int top = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        while(right>=left  && bottom>=top)
        {
            for(int i=left; i<=right; i++)
            {
                arr.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++)
            {
                arr.add(matrix[i][right]);
            }
            right--;
            if(bottom>=top)
            {
                for(int i=right; i>=left; i--)
                {
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(right>=left)
            {
                for(int i=bottom; i>=top; i--)
                {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        for(int i=0; i<arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
    }
}
