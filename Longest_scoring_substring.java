import java.util.*;
public class Longest_scoring_substring {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.next();
        int n = s.length();
        int ans = 0;
        for(int len=n; len>=1; len--)
        {
            for(int left=0; left+len-1<n; left++)
            {
                int right = left + len - 1;
                if(s.charAt(left)==s.charAt(right))
                {
                    int i = left;
                    int j = right; 
                    while(j>=i && s.charAt(i)==s.charAt(j))
                        {
                            i++;
                            j--;
                        } 
                        if(i>=j)
                            {
                                String h = s.substring(left,right+1);
                                if(h.length()==4)
                                {
                                    ans = ans + 5;
                                }

                                if(h.length()==5)
                                {
                                    ans = ans + 10;
                                }
                            } 
                }
            }
        }
        System.out.println(ans);
    }

    
}
