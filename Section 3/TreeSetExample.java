import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String [] args){
        Comparator<String> comparator = (o1, o2) -> o1.length()-o2.length();

        TreeSet<String> names = new TreeSet<>(comparator);
        names.add("Isla");
        names.add("Andrew");
        names.add("Charlie");
        names.add("Isabella");
        for (var name:names){
            System.out.println(name);
        }
    }
}
