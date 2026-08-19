import java.util.*;

class Hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s1 = sc.nextLine();
        int c = 0;
        StringBuilder s2 = new StringBuilder(s1);
        for(int i=0; i<s2.length(); i++)
        {
            if(s2.charAt(i) == '#')
            {
                c++;
                s2.deleteCharAt(i);
            }
        }

        StringBuilder s3 = new StringBuilder();
        for (int i = 0; i < c; i++) {
           s3.append('#');
        }
        System.out.println(s3.toString() + s2.toString());

    }
}