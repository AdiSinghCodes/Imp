import java.util.*;
public class Cap4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();

        }

        Map<Integer,Integer> mp = new HashMap<>();
        
            for(int i=0; i<n; i++)
            {
                mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
            }

        for(Map.Entry<Integer,Integer> en: mp.entrySet())
        {
            System.out.println(en.getKey() + "->" + en.getValue());
        }
    }
}
