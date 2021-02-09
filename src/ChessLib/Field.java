package ChessLib;

public class Field {
    public Pos pos;
    public Figure figure;
    public Color color;
    public boolean isHighlighted;

    public Field(Pos pos){
        this.pos = pos;
        this.color = (pos.x % 2 + pos.y % 2) % 2 == 1 ? Color.black : Color.white;
    }

    @Override
    public String toString() {
        if(figure != null){
            return color.toString() + figure.toString();
        }else {
            return color.toString();
        }
    }
}
