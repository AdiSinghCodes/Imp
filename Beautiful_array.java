import java.util.*;
public class Beautiful_array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int n = sc.nextInt();

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        while(ans.size() < n)
        {
             ArrayList<Integer> temp = new ArrayList<>();
             for(int el : ans)
             {
                if(2*el-1 <= n)
                {
                    temp.add(2*el-1);
                }
                
             }

             for(int el : ans)
             {
                if(2*el <= n)
                {
                    temp.add(2*el);
                }
                
             }
             ans = temp;
        }

        for(int el : ans)
        {
            System.out.print(el + " ");
        }
        sc.close();
    }
}
