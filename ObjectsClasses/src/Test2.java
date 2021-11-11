/*
Correct Answer: You cannot define a class as static unless it is a nested class.
Remove the word static and your result is GreatApp 1 2.
 */

final class GreatStuff {  // Line 1 remove Static
    public final static String APP_NAME = "GreatApp";
    public static int counter = 1;  // Line 2

    public final static int helpfulMethod() {  // Line 3
        return counter++;  // Line 4
    }
}

public class Test2 {
    public static void main(String[] args) {
        System.out.println(GreatStuff.APP_NAME + " " + GreatStuff.helpfulMethod() + " " + GreatStuff.counter);
    }
}
