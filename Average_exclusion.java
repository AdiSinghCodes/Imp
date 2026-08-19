import java.util.*;
public class Average_exclusion {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter elemnt");
        int[] arr = new int[n];
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            if(maxi < arr[i])
            {
                maxi = arr[i];
            }

            if(mini > arr[i])
            {
                mini = arr[i];
            }

        }

        
        int c= 0;
        int u = 0;
       
        for(int i=0; i<n; i++)
        {
            if(arr[i] != mini && arr[i]!=maxi)
            {
                c++;
                u += arr[i];
            }
        }
        int k = (u/c);
        System.out.println(k);
    }
}
