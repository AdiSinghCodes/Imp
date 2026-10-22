import java.util.*;

public class A1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h[] = new int[n];

        for(int i=0; i<n; i++)
        {
            h[i] = sc.nextInt();
        }

        int end = 0;
        int farthest = 0;
        int jump = 0;

        for(int i=0; i<n-1; i++)
        {
            farthest = Math.max(farthest, i + h[i]);
            if(i==end)
            {
                jump++;
                end = farthest;
            }

        }
        System.out.print(jump);
        sc.close();
}
}
    
