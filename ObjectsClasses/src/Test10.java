
/*
Correct Answer. A compiler error occurs on Line 1 because you cannot use the
access modifier 'protected' (or 'private') on an outer class.
A compiler error occurs on Line 4 because you cannot use 'super' in a static method.
 */
public class SuperClass {  // Line 1
    public void testMe() { System.out.println("SuperClass"); }
}

public class Test10 extends SuperClass {
    protected static void testMe() { System.out.println("Test"); }  //Line 2

    public static void main(String[] args) {
        testMe();  // Line 3
        //super.testMe();  // Line 4
    }
}