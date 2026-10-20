
import java.util.*;
public class CB4{
    public static void main(String[] args)
    {
        public void check(TreeNode root, Map<Integer, Integer> mp) {
        if (root == null) {
            return;
        }

        mp.put(root.val, mp.getOrDefault(root.val, 0) + 1);

        check(root.left, mp);
        check(root.right, mp);
    }

    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }

        Map<Integer, Integer> mp = new HashMap<>();

        check(root, mp);

        int maxFreq = 0;

        for (int y : mp.keySet()) {
            maxFreq = Math.max(maxFreq, mp.get(y));
        }

        ArrayList<Integer> nums = new ArrayList<>();

        for (int y : mp.keySet()) {
            if (mp.get(y) == maxFreq) {
                nums.add(y);
            }
        }

        int[] u = new int[nums.size()];

        for (int i = 0; i < u.length; i++) {
            u[i] = nums.get(i);
        }

        return u;
    }
    }
}

