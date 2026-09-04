public class Solution {
    public String reformat(String s) {
        ArrayList<Character> ch = new ArrayList<>();
        ArrayList<Character> di = new ArrayList<>();

        for(int i=0; i<s.length(); i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                ch.add(s.charAt(i));
            }
            else
            {
                di.add(s.charAt(i));
            }
        }
        if(Math.abs(ch.size() - di.size()) > 1)
        {
            return "";
        }

        String k = "";
        if(di.size() > ch.size())
        {
            k = k + di.get(0);
            di.remove(0);
        }
        while(!ch.isEmpty()  || !di.isEmpty())
        {
            if(!ch.isEmpty())
            {
                k = k + ch.get(0);
                ch.remove(0);
                
            }

            if(!di.isEmpty())
            {
                k = k + di.get(0);
                di.remove(0);
          
            }
        }
        return k;


    }
} 
