package ChessLib;

public abstract class Figure {
    public Color color;
    public String symbol;
    public abstract void move(ChessBoard board, Field field, Pos to) throws Exception;
    @Override
    public String toString() {
        return color.toString() + symbol;
    }
}
