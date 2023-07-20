import java.util.LinkedList;


//  Write a Java program to join two linked lists.

public class Joinlist {

    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();

        list1.add("vivek");
        list1.add("kumar");
        list1.add("jha");

        LinkedList<String> list2 = new LinkedList<>();

        list2.add("karishma");
        list2.add("jha");

        list1.addAll(list2);

        System.out.println(list1);

    }
}
