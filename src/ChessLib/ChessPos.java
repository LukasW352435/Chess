package ChessLib;

import java.util.HashMap;
import java.util.Map;

public enum ChessPos {
    A(0, "A", false),
    B(1, "B", false),
    C(2, "C", false),
    D(3, "D", false),
    E(4, "E", false),
    F(5, "F", false),
    G(6, "G", false),
    H(7, "H", false),
    One(7, "1", true),
    Two(6, "2",true),
    Three(5, "3",true),
    Four(4, "4",true),
    Five(3, "5",true),
    Six(2, "6",true),
    Seven(1, "7",true),
    Eight(0, "8",true);
    public int index;
    public String label;
    public boolean isNumber;
    private static final Map<Integer, ChessPos> BY_INDEX = new HashMap<>();

    static {
        for(ChessPos c: values()){
            BY_INDEX.put(c.index, c);
        }
    }

    ChessPos(int index, String label, boolean isNumber){
        this.index = index;
        this.label = label;
        this.isNumber = isNumber;
    }

    public static ChessPos valueOfIndex(int index){
        return BY_INDEX.get(index);
    }
}
