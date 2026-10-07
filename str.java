import java.util.*;

public class str{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String ransomNote = sc.nextLine();
        String magazine = sc.nextLine();

         if(magazine.length() < ransomNote.length())
        {
            System.out.print("false");
        }
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0; i<magazine.length(); i++)
        {
            mp.put(magazine.charAt(i), mp.getOrDefault(magazine.charAt(i),0)+1);
        }

        for(int i=0; i<ransomNote.length(); i++)
        {
            char t = ransomNote.charAt(i);
            if(!mp.containsKey(t) || mp.get(t)==0)
            {
                System.out.print("false");
            }
            else
            {
                mp.put(t,mp.get(t) - 1);
            }

        }
        System.out.print("True");
        
    }
}