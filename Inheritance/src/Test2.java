interface ITest {
    void myMethod();
}
abstract class ATest implements ITest {
    abstract public void myMethod(); // Line 1
}

public class Test2 extends ATest {
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.myMethod();
    }

    public void myMethod() {   // Line 2
        System.out.println("Success");
    }
}