import ChessLib.ChessBoard;
import ChessLib.ChessPos;
import ChessLib.Color;
import ChessLib.Pos;

public class Main {
    public static void main(String[] args) throws Exception {
        ChessBoard c = new ChessBoard();
        System.out.println(c);
        c.move(Color.white,new Pos(ChessPos.E, ChessPos.One),new Pos(ChessPos.F, ChessPos.Two));
        System.out.println();
        System.out.println(c);
    }
}  