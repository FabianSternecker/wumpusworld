import java.util.HashMap;

public class Field {

    HashMap<String, Boolean> states = new HashMap<>();

    public Field() {
        states.put("empty", true);
        states.put("breeze", false);
        states.put("stench", false);
        states.put("pit", false);
        states.put("wumpus", false);
        states.put("gold", false);
        states.put("discovered", false);
    }

    public void setStateTrue(String state) {
        states.put("empty", false);
        states.put(state, true);
    }

    public void print(int row) {
        String text = "";

        switch (row) {
            case 0:
                break;
            case 1:
                if (!states.get("empty")) {
                    text = (states.get("wumpus") ? "W" : "");
                    text += (states.get("pit") ? "P" : "");
                    text += (states.get("gold") ? "G" : "");
                    text += (states.get("breeze") ? "B" : "");
                    text += (states.get("stench") ? "S" : "");
                }
                break;
            case 3:
                break;
        }
        int spaces = 11 - text.length();
        printSpaces(spaces / 2);
        System.out.print(text);
        printSpaces(spaces - (spaces / 2));
    }

    private void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
}
