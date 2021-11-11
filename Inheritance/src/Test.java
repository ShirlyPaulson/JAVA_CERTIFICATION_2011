abstract class AbstractClass1 {
    protected static int counter;  // Line 1
  //  protected static int getCounter();     // Line 2
   // Abstract void printCounter();  // Line 3

}

public class Test extends AbstractClass1 {

    public static void main(String[] args) {
        AbstractClass1.counter++;   // Line 4
        printCounter();
    }

    public static int getCounter() {  // Line 5
        return AbstractClass1.counter; // Line 6
    }

    public static void printCounter() { // Line 7
        System.out.println("Counter = " + getCounter());
    }
}