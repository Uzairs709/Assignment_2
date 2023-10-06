package FirstNonRepeating;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstNonRepeating {
    private MyHashTable myHashTable;
    private ArrayList<Integer> arrayList;
    public FirstNonRepeating(){
        myHashTable=new MyHashTable();
        arrayList=new ArrayList<>();
    }


    public void input(){
        System.out.print("Enter String: ");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=scanner.next();
        for (int i=0;i<s.length();i++) {
            int x = -1;
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                x = myHashTable.put(s.charAt(i));
            }
            if (x == 0) {
                if (arrayList.contains(myHashTable.getID(s.charAt(i)))) {
                    arrayList.remove(arrayList.indexOf(myHashTable.getID(s.charAt(i))));
                }
            }
            else  if(x==1){
                arrayList.add(myHashTable.getID(s.charAt(i)));
            }
        }
    }

    public char getFirstNonRepeating() {
        if (!arrayList.isEmpty()) {
            return myHashTable.getChar(arrayList.get(0));
        }
        return '-';
    }

}
