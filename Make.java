class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int i = s.length()-1;
        while(i>=0)
        {
            st.push(s.charAt(i--));
        }

        while(!st.isEmpty())
        {
            char ch = st.pop();
            if(sb.length()==0)
            {
                sb.append(ch);
                continue;
            }

            if(sb.charAt(sb.length()-1) != ch && Character.toLowerCase(ch) == Character.toLowerCase(sb.charAt(sb.length()-1)))
            {
                sb.deleteCharAt(sb.length()-1);
                continue;
            }
            else
            {
                sb.append(ch);
            }
             
        }
        return sb.toString();
    }
}