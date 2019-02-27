import java.util.*;
public class Main {

    public static void main(String[] args) {
        Board b = new Board();
        HPlayer p1 = new HPlayer(true, b);
        HPlayer p2 = new HPlayer(false, b);
        Game g = new Game(b, p1, p2);
        g.start();

    }
} 