public class Game {

    Boolean running;
    Board board;
    Player p1;
    Player p2;

    private boolean xTurn;
    
    public Game(Board board, Player p1, Player p2) {
        this.board = board;
        this.p1 = p1;
        this.p2 = p2;
        running = true;
        xTurn = true;
    }

    public void start(){
        while(running) {
            this.board.drawBoard();
            if(xTurn) {
                p1.move();
                
            } else {
                p2.move();
            }
            xTurn = !xTurn;
            int state;
            if((state = board.checkWin()) != -2){
                getWinner(state);
                running = false;
            }
        }
    }

    public void getWinner(int state) {
        board.drawBoard();
        if (state == 1) {
            System.out.println("Congrats Player 1! You win!");
            System.out.println("p2 lost");
        } else if (state == 0) {
            System.out.println("Congrates 2 u win instead ");
            System.out.println("p1 lose");
        } else if (state == -1) {
            System.out.println("Its a tie!");
        }
    }
}