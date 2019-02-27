import java.util.Scanner;

public class HPlayer implements Player {
    private boolean isX;
    Board board;
    Scanner in;
    
    public HPlayer(boolean isX, Board board) {
        this.isX = isX;
        in = new Scanner(System.in);
        this.board = board;
    }

    public void move(){
        System.out.println("Please enter the cordinates");
        int x;
        int y;
        try {
            x = in.nextInt();
            y = in.nextInt();
        } catch(Exception e){
            System.out.println("Invalid Input. Try Again");
            in.next();
            move();
            return;
        }
        if((x > 2) || (y > 2) || (x < 0) || (y < 0)) {
            System.out.println("Invalid Input. Try Again");
            move();
            return;
        }

        if(!board.placePiece(x, y, isX)){
            System.out.println("Piece already there. Try Again");
            move();
            return;
        }
        
    }
}