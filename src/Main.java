import java.util.*;
import java.util.List;
public class Main{
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("J","C","Z","K","A");
        System.out.println("Lista sin comparar.");
        lista.forEach(System.out::println);
        lista.sort(new Comparador());
        System.out.println("Lista comparada.");
        lista.forEach(System.out::println);
    }
}
