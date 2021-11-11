/*
Correct Answer: When you define any constructor in a class,
java does not create the default no args constructor so Line 2 fails,
because a no args constructor does not exist.
Line 4 fails to compile because the Test method that returns a void return type
is NOT an overloaded constructor method. Constructor methods cannot return anything.
This is actually just a method with the same name as the constructor which is permitted
but vastly confusing.
 */
public class Test6{
    String name;
    int age;

    Test6(String name) {
        this.name = name;
    }

    public Test6(String mary, int i) {
    }

    void Test6(String name, int age) { // Line 1
        this.name = name;
        this.age = age;
    }

    static public void main(String[] args) {
        //Test6 a = new Test6(); // Line 2
        Test6 b = new Test6("Mary");  // Line 3
        Test6 c = new Test6("Mary", 25);  // Line 4
        b.Test6("Mary", 25);  // Line 5
    }
}