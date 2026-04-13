import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        
        PriorityQueue<String> cola = new PriorityQueue<>();
        cola.offer("Carlos");
        cola.offer("Ana");
        cola.offer("luis");


        while (!cola.isEmpty()){
            System.out.println(cola.poll());
        }

    }
    
}