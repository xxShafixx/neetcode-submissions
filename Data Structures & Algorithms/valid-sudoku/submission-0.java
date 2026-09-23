class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row=0 ; row<9 ; row++) {
            HashSet<Character> set = new HashSet<>();
            for (int i=0 ; i<9 ; i++) {
                if (board[row][i] == '.') {
                    continue;
                } else if (set.contains(board[row][i])) {
                    return false;
                } else {
                    set.add(board[row][i]);
                }
            }
        }

        for (int column=0 ; column<9 ; column++) {
            HashSet<Character> set = new HashSet<>();
            for (int i=0 ; i<9 ; i++) {
                if (board[i][column] == '.') {
                    continue;
                } else if (set.contains(board[i][column])) {
                    return false;
                } else {
                    set.add(board[i][column]);
                }
            }
        }

        for (int square=0 ; square<9 ; square++) {
            HashSet<Character> set = new HashSet<>();
            for (int i=0 ; i<3 ; i++) {
                for (int j=0 ; j<3 ; j++) {
                    int row = (square/3) * 3 + i;
                    int column = (square%3) * 3 + j;

                    if (board[row][column] == '.') {
                        continue;
                    } else if (set.contains(board[row][column])) {
                        return false;
                    } else {
                        set.add(board[row][column]);
                    }
                }
            }
        }

        return true;
    }
}
