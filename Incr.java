class Solution {
    public String sortString(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        String m = "";
        for(int i=0; i<s.length(); i++)
        {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
        }

        while(!mp.isEmpty())
        {

            for(char ch='a'; ch<= 'z'; ch++)
            {
                if(mp.containsKey(ch))
                {
                    m = m + ch;
                    mp.put(ch, mp.get(ch) - 1);
                    if(mp.get(ch)==0)
                    {
                        mp.remove(ch);
                    }
                }
                

            }

            for(char ch='z'; ch>= 'a'; ch--)
            {
                if(mp.containsKey(ch))
                {
                    m = m + ch;
                    mp.put(ch, mp.get(ch) - 1);
                    if(mp.get(ch)==0)
                    {
                        mp.remove(ch);
                    }
                }
                

            }
        }
        return m;


        
    }
}
