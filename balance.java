class Solution {
    public boolean isBalanced(String num) {
        int n = 0;
        int m = 0;
        for(int i =0; i<num.length(); i++)
        {
            if(i%2==0)
            {
                n = n + num.charAt(i) - '0';
            }
            else
            {
                m = m + num.charAt(i) - '0';
            }
        }
        return n==m;
    }
}