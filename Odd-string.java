class Solution {
    public String oddString(String[] words) {

        Map<Character, Integer> mp = new HashMap<>();

        int m = 0;

        for(char ch = 'a'; ch <= 'z'; ch++) {
            mp.put(ch, m++);
        }

        List<List<Integer>> arr = new ArrayList<>();

        // Create difference array for every word
        for(int i = 0; i < words.length; i++) {

            String k = words[i];

            List<Integer> diff = new ArrayList<>();

            for(int j = 0; j < k.length() - 1; j++) {

                diff.add(
                    mp.get(k.charAt(j + 1)) -
                    mp.get(k.charAt(j))
                );
            }

            arr.add(diff);
        }

        int y = 0;
        int n = words.length;
        for(int i=0; i<n; i++)
        {
            y = 0;
            for(int j=0; j<n; j++)
            {
                if(i!=j && !arr.get(j).equals(arr.get(i)))
                {
                    y++;
                }
                 if(y==n-1)
                {
                    return words[i];
                }

                
            }
           
        }
        return "";
    }
}