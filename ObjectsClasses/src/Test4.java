/*
Correct Answer: All of the lines compile. You can reference a static variable or
method like an instance variable. You can also reference a static class member
using a null object or just using the class name of the class
where the static variable is declared.
 */
class TestStatic {
    static String name = "Mary";

    public static String getName() {
        return name;
    }
}

public class Test4 {

    public static void main(String[] args) {
        TestStatic t0 = new TestStatic();
        TestStatic t1 = null;
        System.out.println(t0.name);

         System.out.println(t0.getName());

          System.out.println(TestStatic.name);

          System.out.println(TestStatic.getName());

          System.out.println(t1.name);

          System.out.println(t1.getName());

        //*   Insert code here *//

    }
}