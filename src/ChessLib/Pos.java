package ChessLib;

public class Pos {
    // pos in the board array
    public int x;
    public int y;
    // pos used on the chessboard
    ChessPos chessPosX;
    ChessPos chessPosY;

    public Pos(int x, int y) throws Exception {
        if (!(0 <= x && x < 8) || !(0<=y && y < 8) ){
            throw new Exception("x or y out of range");
        }
        this.x = x;
        this.y = y;
        convertToChessPos();
    }

    public Pos(ChessPos x, ChessPos y) throws Exception {
        if(x.isNumber || !y.isNumber){
            throw new Exception("x or y out of range");
        }
        this.chessPosX = x;
        this.chessPosY = y;
        convertToPos();
    }

    private void convertToChessPos() {
        this.chessPosX = ChessPos.valueOfIndex(this.x);
        this.chessPosY = ChessPos.valueOfIndex(this.y);
    }

    private void convertToPos() {
        this.x = chessPosX.index;
        this.y = chessPosY.index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pos pos = (Pos) o;
        return x == pos.x &&
                y == pos.y;
    }
}
