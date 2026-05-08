class Solution {
    public boolean isValidSudoku(char[][] board) {
        // HashMap<Integer, HashSet<Character>> rows =  new HashMap<>();
        // HashMap<Integer, HashSet<Character>> cols =  new HashMap<>();
        // HashMap<String, HashSet<Character>> squares = new HashMap<>();

        // for( int r=0; r<9; r++){
        //     for( int c=0; c<9; c++){
        //         if(board[r][c] == '.') continue;

        //         String squareKey = (r/3) + "," + (c/3);
        //         rows.putIfAbsent(r, new HashSet<>());
        //         cols.putIfAbsent(c, new HashSet<>());
        //         squares.putIfAbsent(squareKey, new HashSet<>());
                
        //         char ch = board[r][c];

        //         if(rows.get(r).contains(ch) || 
        //             cols.get(c).contains(ch) ||
        //             squares.get(squareKey).contains(ch))
        //         {
        //             return false;
        //         }
                
        //         rows.get(r).add(ch);
        //         cols.get(c).add(ch);
        //         squares.get(squareKey).add(ch);
        //     }
        // }
        // return true;

        boolean[][] R = new boolean[9][9];
        boolean[][] C = new boolean[9][9];
        boolean[][] B = new boolean[9][9];

        for(int r = 0; r<9; r++){
            for (int c=0; c<9; c++){
                if(board[r][c] == '.') continue;

                int n = board[r][c] - '1';
                int b = (r/3)*3 + (c/3);

                if(R[r][n] || C[c][n] || B[b][n]) return false;

                R[r][n] = C[c][n] = B[b][n] = true;
            }
        }
        return true;
    }
}
