import java.util.*;

class Longest_Palindromic_String{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Longest_Palindromic_String ch = new Longest_Palindromic_String();
        String h = ch.longestPalindrome(s);
        System.out.println(h);

    }

    public String longestPalindrome(String s) {
        int n = s.length();

        for(int len = n; len>=1; len--)
        {
            for(int left = 0; left+len-1 <n; left++)
            {
                int right = left+len-1;
                if(s.charAt(left) == s.charAt(right))
                {
                    int i = left;
                    int j = right;
                    while(j>=i && s.charAt(i) == s.charAt(j))
                    {
                        i++;
                        j--;
                    }
                    if(i>=j)
                    {
                        return s.substring(left,right+1);
                    }
                }
                
            }
        }
        return "";
    }
    
    
}
