class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                   if (board[i][j] == '.') {
                    continue;
                }

                char num = board[i][j];

                String r = num + "row" + i;
                String c = num + "col" + j;
                String b = num + "box" + (i/3) + (j/3);

                if(set.contains(r) || set.contains(c) || set.contains(b))
                {
                    return false;
                }
                set.add(r);
                set.add(c);
                set.add(b);

            }

        }
        return true;
    }
}