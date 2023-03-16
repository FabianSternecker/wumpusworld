import java.util.Iterator;

public class PlayingField {

    public final int LENGTH = 4;
    public final int WIDTH = 4;
    Field[][] fields = new Field[LENGTH][WIDTH];


    public PlayingField() {
        //initialize empty fields
        for (int x = 0; x < LENGTH; x++) {
            for (int y = 0; y < WIDTH; y++) {
                fields[x][y] = new Field();
            }
        }
    }

    public void surroundFieldWith(int x, int y, String text) {
        setFieldIfNotOutOfBounds(x + 1, y, text);
        setFieldIfNotOutOfBounds(x - 1, y, text);
        setFieldIfNotOutOfBounds(x, y + 1, text);
        setFieldIfNotOutOfBounds(x, y - 1, text);
    }

    public void setFieldIfNotOutOfBounds(int x, int y, String text) {
        if (x < 0)
            return;
        if (x > LENGTH - 1)
            return;
        if (y < 0)
            return;
        if (y > WIDTH - 1)
            return;

        setOrAppendField(x, y, text);
    }

    public void setOrAppendField(int x, int y, String text) {
        fields[x][y].setStateTrue(text);
    }

    public void print() {
        for (int x = 0; x < LENGTH; x++) {
            System.out.println("#################################################");
            for (int k = 0; k < 3; k++) {
                for (int y = 0; y < WIDTH; y++) {
                    System.out.print("#");
                    fields[x][y].print(k);
                }
                System.out.println("#");
            }
        }
        System.out.println("#################################################");
    }
}
/*
←
↑
→
↓
⟡
⋍⋍⋍
⩰⩰⩰
BBB

⪟⪟⪟
SSS
ooo
G
WWW


#################################################
#           #           #           #           #
#    WB     #           #           #           #
#           #           #           #           #
#################################################
#           #           #           #           #
#           #           #           #           #
#           #           #           #           #
#################################################
#           #           #           #           #
#           #           #           #           #
#           #           #           #           #
#################################################
#           #           #           #           #
#           #           #           #           #
#    →→→    #           #           #           #
#################################################

*/

