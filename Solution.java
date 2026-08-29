class Solution {
    public int lengthOfLastWord(String s) {
        Stack<String> st = new Stack<>();

        int i = 0;
        while(i<s.length())
        {
            if(s.charAt(i) != ' ')
            {
                StringBuilder sb = new StringBuilder();
                while(i<s.length() && s.charAt(i) != ' ')
                {
                    sb.append(s.charAt(i));
                    i++;
                }
                st.push(sb.toString());
            }
            i++;
        }

        return (st.pop().length());
    }
}