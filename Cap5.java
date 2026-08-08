import java.util.*;

public class Cap5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();  // even though 'c' is unused, kept to match original code
        
        double ans = Math.pow(a,3) + Math.pow(a,2) * b + Math.pow(a,2) * b *2 + Math.pow(b,2) * a  * 2 + Math.pow(b,2) * a + Math.pow(b,3);
        System.out.println(ans);
    }
}