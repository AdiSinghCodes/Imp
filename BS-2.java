class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        while(high>=low)
        {
            int mid =(high+low)/2;
            long square = (long) mid * mid;
            if(square==num)
            {
                return true;
            }
            if(square > num)
            {
                high = mid -1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return false;
    }
}