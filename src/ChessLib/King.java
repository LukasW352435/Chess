package ChessLib;

public class King extends Figure {

    public King(Color color){
        this.color = color;
        this.symbol = "K";
    }
    @Override
    public void move(ChessBoard board, Field field, Pos to) throws Exception {
        if(!(field.pos.x - to.x < 2) || !(field.pos.y - to.y < 2)){
            throw new Exception("king cant move that far");
        }
        Field movingField = board.getField(to);
        if(movingField.figure == null){
            // TODO check if the field is valid, dont allow invalid moves like moving king in check
            movingField.figure = this;
            field.figure = null;
        }else{
            if(movingField.figure.color == this.color){
                throw new Exception("cant throw your own figures");
            }else {
                // TODO check if the field is valid, dont allow invalid moves like moving king in check
                movingField.figure = this;
            }
        }
    }
}
