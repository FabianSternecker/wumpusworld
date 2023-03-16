import java.util.Random;

public class World {
    PlayingField playingField = new PlayingField();

    public World() {
        Random r = new Random();

        //Pit
        for (int x = 0; x < playingField.LENGTH; x++) {
            for (int y = 0; y < playingField.WIDTH; y++) {
                if (r.nextInt(0, 100) < 20) {
                    playingField.setOrAppendField(x, y, "pit");
                    playingField.surroundFieldWith(x, y, "breeze");
                }
            }
        }

        //Wumpus
        int wumpusX = r.nextInt(0, 4);
        int wumpusY = r.nextInt(0,4);
        playingField.setOrAppendField(wumpusX,wumpusY,"wumpus");
        playingField.surroundFieldWith(wumpusX, wumpusY, "stench");


        //Gold
        int goldX = r.nextInt(0, 4);
        int goldY = r.nextInt(0,4);
        playingField.setOrAppendField(goldX,goldY,"gold");

    }

    public void print(){
        playingField.print();
    }
}
