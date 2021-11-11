/*
Correct Answer: You cannot refer to a non static field in a static initializer block.
If you comment this line out, the answer would be G (output is 2),
because both instance initializer blocks would execute before the code in the constructor,
which then sets the value to 2. It is perfectly valid, but highly discouraged, to have a class,
a field attribute, a method and local variables all with the same name 'test'.
 */

class test {

    public int test;  // Line 1
    {
        test = 1;
    }
    public int test() { return test;   }  // Line 2
    public test() {  test = 2;   }
    {   test = 3;   }  // Line 3
    //static { test = 4; }   // Line 4 ---- ERROR
    {test = 4;}
    public String toString() {  return ""+test();   }
}

public class CallTest {
    public static void main(String[] args) {
        test test = new test();   // Line 5
        System.out.println(test);
    }

}
