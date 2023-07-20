
import java.util.LinkedList;
import java.util.Iterator;


public class Reverseorder {
    

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

      
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");

       
        Iterator<String> reverseIterator = linkedList.descendingIterator();


        System.out.println("Linked List in Reverse Order:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
