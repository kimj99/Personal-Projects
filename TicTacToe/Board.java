public class Board {

    private String[] board;
    private static final String X_STRING = "X";
    private static final String O_STRING = "O";
    private static final String DEFAULT_STRING = "-";
    
    public Board() {
        board = new String[9];
        reset();
    }

    public void reset() {
        for(int i = 0; i < 9; i++){
            board[i] = DEFAULT_STRING;
        }
    }

    public void drawBoard() {
        for (int i = 0;i < 3;i++) {
            for(int j = 0; j < 3; j++){
                System.out.print(getPiece(i, j) + " ");
            }
            System.out.println();
        }
    }

    public boolean placePiece(int x, int y, Boolean isX){
        if (getPiece(x, y) == DEFAULT_STRING) {
            setPiece(x, y, isX);
            return true;
        } else {
            return false;
        }
    }

    public String getPiece(int x, int y){
        return board[(3*x)+y];
    }

    private void setPiece(int x, int y, boolean isX){
        String value = null;
        if(isX){
            value = X_STRING;
        } else {
            value = O_STRING;
        }

        board[(3*x)+y] = value;
    }

    public int checkWin() {
        for (int i = 0; i < 8; i++) {
            String line = null;
            switch (i) {
            case 0:
                line = board[0] + board[1] + board[2];
                break;
            case 1:
                line = board[3] + board[4] + board[5];
                break;
            case 2:
                line = board[6] + board[7] + board[8];
                break;
            case 3:
                line = board[0] + board[3] + board[6];
                break;
            case 4:
                line = board[1] + board[4] + board[7];
                break;
            case 5:
                line = board[2] + board[5] + board[8];
                break;
            case 6:
                line = board[0] + board[4] + board[8];
                break;
            case 7:
                line = board[2] + board[4] + board[6];
                break;
            }
            if (line.equals("XXX")) {
                return 1;
            } else if (line.equals("OOO")) {
                return 0;
            } else if (boardFull()) {
                return -1;
            }
        }
        return -2;
    }

    private boolean boardFull() {
        for (int i = 0;i < 9;i++) {
            if (board[i] == DEFAULT_STRING) {
                return false;
            }
        }
        return true;
    }

    public String[] getBoardData() {
        return board;
    }

    public void setBoardData(String[] board) {
        this.board = board;
    }

    public Board copy() {
        Board result = new Board();
        result.setBoardData(this.getBoardData());
        return result;
    }

}