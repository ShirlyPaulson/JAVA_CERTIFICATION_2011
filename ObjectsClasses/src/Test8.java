/*
Correct Answer: Code compiles and executes without any issues.
An exception is thrown on Line 4 but handled in the catch clause,
hence the word 'Test' is printed only four times, not five.
 */

public class Test8 {
    String getMyName() {
        return myName;   // Line 1
    }

    static String myName = "Test";

    public static void main(String[] args) {

        try {
            Test8 t1 = new Test8();
            Test8 t2 = null;
            System.out.print(Test8.myName);
            System.out.print(t1.myName);  // Line 2
            System.out.print(t1.getMyName());

            System.out.print(t2.myName);  // Line 3
            System.out.print(t2.getMyName());    // Line 4
        } catch (Exception e) {
            System.out.println();
        }
    }
}