import java.util.*;


class Decode_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<StringBuilder> stringstack = new Stack<>();
        Stack<Integer> countstack = new Stack<>();
        int num = 0;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
            {
                num = num * 10 + (ch - '0');
            }
            else if(ch=='[')
            {
                stringstack.push(ans);
                countstack.push(num);
                num = 0;
                ans = new StringBuilder();
            }
            else if(ch==']')
            {
                StringBuilder previous = stringstack.pop();
                int repeat = countstack.pop();
                for(int m=0; m<repeat; m++)
                {
                    previous.append(ans);
                }

                ans = previous;
            }
            else
            {
                ans.append(ch);
            }
        }

        System.out.println(ans.toString());
        sc.close();
    }
}