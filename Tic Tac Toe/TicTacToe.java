import java.util.*;
public class TicTacToe {

    public static void main(String[] args) {
        Board b = new Board();
        b.drawBoard();
    }

    // public static char[][] buildBoard(){
    //     for (int i = 0;i < 3;i++){
    //         for (int j = 0;j<3;j++){
    //             board[i][j] = '-';
    //         }
    //     }
    //     return board;
    // }

    // public static void displayBoard(char[][] board) {
    //     System.out.println("-------------");
    //     for (int i = 0; i < 3; i++) {
    //         System.out.print("| ");
    //         for (int j = 0; j < 3; j++) {
    //             System.out.print(board[i][j] + " | ");
    //         }
    //         System.out.println();
    //         System.out.println("-------------");
    //     }
    // }
    // public static void userInput(){
    //     System.out.println("");
    //     int row = in.nextInt();
    //     int column = in.nextInt();
    //     if (user == 1 && xMove == false) {
    //         board[row][column] = 'X';
    //         xMove = true;
    //     } else if (user != 1 && oMove == false){
    //         board[row][column] = 'O';
    //         oMove = true;
    //     }
    // }
} 