import java.util.LinkedList;

class ReverseList{



//Write a Java program to retrieve, but not remove, the last element of a linked list. in java


    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("vivek");
        list.add("kumar");
        list.add("jha");

        String LastElement = list.getLast();

        System.out.println(LastElement);




        
    }
}