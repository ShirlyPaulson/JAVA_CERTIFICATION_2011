public class Test {
    static int i;
    public static void main(String[] args) {

        int i, j, k= 10; // Line 1
        i = Test.i+k; // Line 2
        k = i+++k;  // Line 3
        //Test.i = j+i; // Line 4
        System.out.println(i+" " +k);
    }

}
