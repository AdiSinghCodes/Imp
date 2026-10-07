import java.util.*;

public class strin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int left = 0;
        int right = s.length()-1;
        char[] arr = s.toCharArray();
        while(right>left)
        {
            if(!(arr[left] == 'a' || arr[left] == 'A' || arr[left] == 'E' || arr[left] == 'e' || 
            arr[left] == 'i' ||arr[left] == 'I' ||arr[left] == 'o' ||arr[left] == 'O' ||arr[left] == 'u' ||arr[left] == 'U'))
            {
                left++;
            }  
            else if(
             !(arr[right] == 'a' || arr[right] == 'A' || arr[right] == 'E' || arr[right] == 'e' || 
            arr[right] == 'i' ||arr[right] == 'I' ||arr[right] == 'o' ||arr[right] == 'O' ||arr[right] == 'u' ||arr[right] == 'U'))
            {
                right--;
            }
            else
            {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
          
            


    }
     for(int i=0; i<arr.length; i++)
           {
            System.out.print(arr[i]);
           }
           sc.close();

}
}
