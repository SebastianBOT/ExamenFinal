import java.util.Comparator;

public class Comparador implements Comparator<String> {

    @Override
    public int compare(String num1, String num2){
        return num1.compareTo(num2);
    }
}
