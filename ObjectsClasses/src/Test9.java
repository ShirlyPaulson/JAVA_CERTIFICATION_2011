
/*
constant variable initialized after static variable
it prints
Great
Great
Great Name
 */
class AppTest {
    static String AppName = "Great";
    final static String goodName = "Good";
    final static String greatName = AppName;  // Line 1

    static {
        AppName += " Name";   // Line 2 constant variable initialized after static variable
    }

    final static String badName = AppName;   // Line 3
}

public class Test9 {
    public static void main(String[] args) {

        AppTest t = null;
        System.out.println(t.goodName);
        System.out.println(t.greatName);
        System.out.println(t.badName);
    }
}