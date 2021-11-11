public class Test5 {

    public static void main(String[] args) {
        int a = incrementByOne(5); // returns 5 not 6
        System.out.println(a);
    }

    public static int incrementByOne(int b) {
        //b++;
        return b++; // returns 5 because before incrementing it sends the value of b
    }
}