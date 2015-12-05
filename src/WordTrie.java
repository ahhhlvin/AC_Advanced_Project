import java.util.ArrayList;
import java.util.List;

public class WordTrie {

    public void add(String word) {
        // FIXME: Implement this.
    }

    public boolean contains(String word) {
        // FIXME: Implement this.

        Node pointer = new Node();

        for (int i = 0; i < word.length(); i++) {
            pointer = pointer.next;
        }


        return false;
    }

    public List<String> toList() {
        List<String> words = new ArrayList<String>();
        // FIXME: Implement this.
        return words;
    }

}