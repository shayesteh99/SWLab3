import java.util.ArrayList;

public class Clipboard {
    private ArrayList<String> strings;

    public Clipboard() {
        strings = new ArrayList<>();
    }

    public void addToClipboard(String string) {
        this.strings.add(string);
    }

    public boolean checkInClipboard(String string) {
        return this.strings.contains(string);
    }

}
