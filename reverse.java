class Solution {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();

        for(int i=0; i<s.length(); i+=2*k)
        {
            int left = i;
            int right = Math.min(s.length()-1, i+k-1);

            while(right>left)
            {
                char m = ch[left];
                ch[left] = ch[right];
                ch[right] = m;
                left++;
                right--;
            } 
        }
        return new String(ch);
    }
}
