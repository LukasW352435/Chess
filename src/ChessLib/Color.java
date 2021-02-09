package ChessLib;

public enum Color {
    white("w"),
    black("b");
    private String color;

    Color(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
