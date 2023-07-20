
import java.util.ArrayList;


public class second {


    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();


        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");


        System.out.println("Original ArrayList: " + fruits);


        String specifiedElement = "Grapes";
        if (fruits.size() >= 2) {
            fruits.set(1, specifiedElement);
        } else {
            System.out.println("The ArrayList does not have enough elements to replace the second element.");
        }


        System.out.println("Modified ArrayList: " + fruits);
    }
}
