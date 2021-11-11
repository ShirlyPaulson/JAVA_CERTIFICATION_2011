/*
Correct Answer: There is an extra semi-colon in the for loop declaration,
in the increment expression " i-- ; i += 1".
If you replace the semi-colon with a comma,
code will compile and execute,
and output would be "1,3,5,7,9,"
 */

public class Test4 {
    static int testVariable;

    public static void main(String[] args) {
        for (int i = 0; i++ < 10; i-- , i += 1){

            System.out.print(i++ + ",");
        }
    }
}