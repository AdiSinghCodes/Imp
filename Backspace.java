class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder st = new StringBuilder(s);
        StringBuilder st2 = new StringBuilder(t);
        StringBuilder m = new StringBuilder();
        StringBuilder n = new StringBuilder();
        for(int i=0; i<st.length(); i++)
        {
            if(st.charAt(i) == '#')
            {
                if(m.length()>0)
                {
                    m.deleteCharAt(m.length()-1);
                }
            }
            else
            {
                m.append(st.charAt(i));
            }
        }

        for(int i=0; i<st2.length(); i++)
        {
            if(st2.charAt(i) == '#')
            {
                if(n.length()>0)
                {
                    n.deleteCharAt(n.length()-1);
                }
            }
            else
            {
                n.append(st2.charAt(i));
            }
        }
         return m.toString().equals(n.toString());


    }
}