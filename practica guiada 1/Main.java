
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arraylist1 = new ArrayList<>();
        List<String> arraylist2 = new ArrayList<>();

        System.out.println(arraylist1.size());

        arraylist1.add("Uvas");
        arraylist1.add("Fresas");


        System.out.println(arraylist1.isEmpty());
        System.out.println(arraylist1.size());

        arraylist2.addAll(arraylist1);

        System.out.println(arraylist1.contains("Uvas"));

        System.out.println(arraylist1.containsAll(arraylist2));
        System.out.println(arraylist2.containsAll(arraylist1));

        System.out.println(arraylist1.equals(arraylist2));

        arraylist1.remove("Uvas");

        System.out.println(arraylist1.equals(arraylist2));

        arraylist1.get(0);

        arraylist1.set(0, "Pipe");
        
        for (String frutas : arraylist1) {
            System.out.println(frutas);
        }

        System.out.println(arraylist1.indexOf("Pipe"));

        String eliminado = arraylist2.remove(0);

        System.out.println(eliminado);
    }
}
