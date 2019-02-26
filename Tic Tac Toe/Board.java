public class Board {

    private String[] board;

    public Board() {
        board = new String[9];
        for(int i = 0; i < 9; i++){
            board[i] = "-";
        }
    }
    public void drawBoard() {
        System.out.println("-------------");
        for (int i = 0;i < 3;i++) {
            for(int j = 0; j < 3; j++){
                System.out.print(getPiece(i, j));
            }
            System.out.println();
        }
        System.out.println("-------------");
    }

    public boolean placePiece(int x, int y, Boolean isX){
        for (int i = 3*x + y;i < 9;i++) {
            if(isX) {
                board[i] = "X";
                return true;
            } else {
                board[i] = "O";
            }
        }
        return false;
    }

    public String getPiece(int x, int y){
        //@Todo figure this math out
        if (placePiece(x, y, true)) {
            return "X";
        }
        return "O";
    }
}