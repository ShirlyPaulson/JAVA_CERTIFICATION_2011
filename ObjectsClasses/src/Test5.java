/*
Correct Answer: The return statement must
return either null or an object/variable from a method
if the method is declared with a return type.
 */
class MethodTest {
    public void methodA(boolean flag) {
        if (!flag) return ;   // Line 1
        System.out.print("four");

    }  // Line 2

    public String methodB(boolean flag, String values) {
        if (!flag) return "";  // Line 3
        String a = "";
        String[] vals = values.split(",");
        for (var val : vals) {   // Line 4
            a += val;
        }
        return a;  // Line 5
    }
}

public class Test5 {
    public static void main(String[] args) {
        MethodTest t = new MethodTest();
        System.out.print(t.methodB(true, "one, two, three "));
        t.methodA(true);
    }
}