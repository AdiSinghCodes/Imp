import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int y : mp.keySet())
        {
            if(mp.get(y) > k)
            {
                for(int i=0; i<k; i++)
                {
                    arr.add(y);
                }
            }
            else
            {
                for(int i=0; i<mp.get(y); i++)
                {
                    arr.add(y);
                }
            }

            
        }

        int[] op = new int[arr.size()];
        for(int i=0; i<op.length; i++)
        {
            op[i] = arr.get(i);
        } 
        return op;
    
    }
} {
    
}
