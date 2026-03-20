
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<String> arraylist1 = new ArrayList<>();
        Collection<String> arraylist2 = new ArrayList<>();

        System.out.println(arraylist1.size());

        arraylist1.add("Uvas");
        arraylist1.add("Fresas");


        System.out.println(arraylist1.isEmpty());
        System.out.println(arraylist1.size());

        arraylist2.addAll(arraylist1);

        System.err.println(arraylist1.contains("Uvas"));

        System.out.println(arraylist1.containsAll(arraylist2));
        System.out.println(arraylist2.containsAll(arraylist1));

        System.err.println(arraylist1.equals(arraylist2));

        arraylist1.remove("Uvas");

        System.err.println(arraylist1.equals(arraylist2));
    }
}
