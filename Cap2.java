import java.util.*;

class Cap2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
        }
        String s2 = "";
        for(Map.Entry<Character,Integer> en: mp.entrySet())
        {
            s2 = s2 + en.getKey();
            int y = en.getValue();
            if(y>1)
            {
                s2 = s2 + Integer.toString(y);
            }
           
        }
        
        System.out.println(s2);
        
    }
}