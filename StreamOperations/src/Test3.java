import java.util.stream.Collectors;
import java.util.stream.Stream;

enum Category {
    FRUIT, VEGETABLE;
}

class ProduceItem {
    private Category category;
    private String value;

    ProduceItem(Category category, String value) {
        this.category = category;
        this.value = value;
    }

    public Category getCategory() {
        return category;
    }

    public String toString() {
        return value;
    }
}

public class Test3 {
    public static void main(String[] args) {

        Stream.of(
                        new ProduceItem(Category.FRUIT, "Apple"),
                        new ProduceItem(Category.VEGETABLE, "Broccoli"),
                        new ProduceItem(Category.FRUIT, "Pear")
                ).collect(Collectors.partitioningBy(
                        c -> c.getCategory() == Category.VEGETABLE)) // Line 1
                .values().stream()  // Line 2
                .forEach(System.out::print);

    }
}