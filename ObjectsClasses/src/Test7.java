public class Test7 {
    public static void main(String[] args) {
        Test7 t = new Test7();
        char c = 'a';
        int i = 10;
        t.printMethod(i, c);
        t.printMethod(c, i);
    }

    public void printMethod(int a, Long b) {   // Method 1
        System.out.println("Method (int, Long) called");
    }

    void printMethod(short a, Character b) {  // Method 2
        System.out.println("Method (short, Character) called");
    }

    void printMethod(int... a) {   // Method 3
        System.out.println("Method (int...) called");

    }
}