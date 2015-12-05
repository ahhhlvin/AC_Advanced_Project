import java.util.ArrayList;
import java.util.List;

public class WordTrie
{
    Node root = new Node();

    public void add(String word)
    {
        Node currentNode = root;
        word = word.toUpperCase();
        // FIXME: Implement this.

        for(int i = 0; i < word.length(); i++)
        {

            int index = charToInt(word.charAt(i));

            if(currentNode.children[index] == null)
            {
                Node child = new Node();
                currentNode.children[index] = child;
            }

            currentNode = currentNode.children[index];

        }

        currentNode.isWord = true;


    }


    public boolean contains(String word)
    {
        // FIXME: Implement this.
        // check if i can get there without hitting null && if isWord = true;

        word = word.toUpperCase();
        Node currentNode = root;


        for (int i = 0; i < word.length(); i++) {

            int index = charToInt(word.charAt(i));
            if (currentNode.children[index] == null) {
                return false;
            } else {
                currentNode = currentNode.children[index];
            }


        }

       return currentNode.isWord;
    }


    public int charToInt(char c) {
        return c - 65;
    }

    public List<String> toList()
    {
        List<String> words = new ArrayList<String>();
        // FIXME: Implement this.


        return words;
    }

    public static void main(String[] args)
    {
        WordTrie trie = new WordTrie();
        trie.add("BEE");
        trie.add("BEEZY");

        System.out.println(trie.contains("bee"));
        System.out.println(trie.contains("breh"));

    }


}