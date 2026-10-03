import java.util.*;

public class S2{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        String a = sc.next();
        int ans =0;
        if(a.length()==1)
        {
            System.out.println(a.charAt(0)-'A' + 1);
        }
        else
        {
            for(int i=0; i<a.length(); i++)
            {
                ans = ans * 26 + (a.charAt(i)-'A') + 1;
            }
            System.out.print(ans);
        }

        sc.close();
    }
}