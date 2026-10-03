import java.util.*;

public class S1{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    StringBuilder s = new StringBuilder();
    while(n>0)
    {
        n--;
        int rem = n%26;
          char ch = (char)('A' + rem);
            s.append(ch);
        n = n / 26;
    }
    System.out.println("Adi bhai" + " " + s.reverse() + "Adi bhai");
    sc.close();
}
}