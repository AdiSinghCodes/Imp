import java.util.*;

class Nesting_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int a = nest(arr);
        System.out.println(a);

    }

    public static int nest(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        int maxarea = 0;
        for (int i = 0; i < arr.length; i++) {
            if (visited[i])
                continue;
            int c = 0;
            int curr = i;
            while (!visited[curr]) {
                visited[curr] = true;
                curr = arr[curr];
                c++;

            }
            maxarea = Math.max(maxarea, c);
        }
         return maxarea;
       
    }
}
