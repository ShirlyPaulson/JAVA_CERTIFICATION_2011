import java.util.LinkedHashSet;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.addAll(List.of("Dog", "Cat", "Gerbil", "Hamster"));
        set.retainAll(List.of("Goat", "Cat", "Hamster"));
        set.addAll(List.of("Cat", "Gerbil"));
        System.out.println(set);
    }
}