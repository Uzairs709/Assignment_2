package FirstNonRepeating;

public class MyHashTable {
    Node[] nodes;
    public MyHashTable(){
        nodes=new Node[26+26];
    }
    public int put(Character character){
        //formula for a to z
        if(character>='a'&&character<='z') {
            int index = character - 'a';
            if (nodes[index] == null) {
                nodes[index]=new Node();
                nodes[index].character = character;
                nodes[index].frequency=0;
                return 1;
            }
            else {
                nodes[index].frequency++;
                return 0;
            }
        }
        //formula for A to Z
        else if(character>='A'&&character<='Z') {
            int index = (character - 'A') + 26;
            if (nodes[index] == null) {
                nodes[index]=new Node();
                nodes[index].character = character;
                nodes[index].frequency=0;
                return 1;
            }
            else {
                nodes[index].frequency++;
                return 0;
            }
        }
        return -1;
    }

    public int getID(Character character){
        if(character>='a'&&character<='z'){
            return character - 'a';
        }else if(character>='A'&&character<='Z'){
            return (character - 'A') + 26;
        }
        return -1;
    }
    public char getChar(int index){
        return nodes[index].character;
    }
}
class Node{
    Character character;
    int frequency;
    Node(){
        this.character='\0';
        frequency=0;
    }
}
