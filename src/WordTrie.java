import java.util.ArrayList;
import java.util.List;

public class WordTrie
{
    Node root = new Node();

    public void add(String word)
    {
        // create a pointer that starts at 'root'
        Node currentNode = root;

        // convert input to uppercase for conversion to be effective
        word = word.toUpperCase();
        // FIXME: Implement this


        // loop through each letter of the word
        for(int i = 0; i < word.length(); i++)
        {
            // convert the character in the word to the ASCII int and convert to place in correct array position
            int index = charToInt(word.charAt(i));

            // if the pointer's children does not contain a node at the character's position, create new node
            // set the pointer's children's position to the new node
            if(currentNode.children[index] == null)
            {
                Node child = new Node();
                currentNode.children[index] = child;
            }

            // change the pointer to the new node that was just created
            currentNode = currentNode.children[index];

        }

        // set the last letter of the input word from default FALSE -> TRUE to indicate that it is a word when later being retrieved in contains()
        currentNode.isWord = true;


    }


    public boolean contains(String word)
    {
        // FIXME: Implement this.

        word = word.toUpperCase();
        Node currentNode = root;


        // iterate the pointer to traverse through the trie and check if i can get there without hitting null && if isWord() = TRUE for the last letter of input word;
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