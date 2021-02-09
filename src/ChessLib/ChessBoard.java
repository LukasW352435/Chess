package ChessLib;

public class ChessBoard {
    // board[y][x]
    public Field[][] board = new Field[8][8];
    public Color turn;

    public ChessBoard() throws Exception {
        turn = Color.white;
        InitBoard();
    }

    public void move(Color player, Pos from, Pos to) throws Exception {
        // TODO check player turn, move figure
        Field field = getField(from);
        if(field.pos.equals(to)){
            throw new Exception("compulsion to move");
        }
        if (field.figure != null) {
            field.figure.move(this, field, to);
        }else {
            throw new Exception("there is no figure at this position");
        }
        if (checkForCheck() || checkStalemate()) {
            // TODO end the game, maybe set a value to player<color> won
            throw new Exception("lol");
        }
    }

    public boolean checkForCheck() {
        // TODO check for check
        return false;
    }

    public boolean checkStalemate() {
        // TODO check for Stalemate
        return false;
    }

    private void InitBoard() throws Exception {
        // TODO set figures on the board
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                try {
                    board[y][x] = new Field(new Pos(x, y));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        getField(new Pos(ChessPos.E, ChessPos.One)).figure = new King(Color.white);
        getField(new Pos(ChessPos.E, ChessPos.Eight)).figure = new King(Color.black);
    }

    public Field getField(Pos pos) {
        return board[pos.y][pos.x];
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        for (int y = 0; y < 8; y++) {
            ret.append(Math.abs(y - 8)).append("\t");
            for (int x = 0; x < 8; x++) {
                ret.append(board[y][x].toString()).append("\t");
            }
            ret.append("\n");
        }
        ret.append("\ta\tb\tc\td\te\tf\tg\th");
        return ret.toString();
    }
}
