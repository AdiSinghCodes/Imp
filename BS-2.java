public class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        if(i==num)
        {
            return true;
        }
        while(i<num)
        {
            
            if(i*i == num)
            {
                return true;
            }
            i++;
            if(i*i>num)
            {
                break;
            }
        }

        return false;
    }
} {
    
}
