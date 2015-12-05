/**
 * Created by alvin2 on 12/5/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Node
{
    Node data;
    char[] letters = new char[26];


    public Node()
    {
        for (int i = 0; i < 26; i++) {
            this.letters[i] = i + 41;
        }
    }
}
