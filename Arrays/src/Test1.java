/*
Correct Answer: elements in bArray are never initialized,
so if you try to loop through it and use auto unboxing
in the for loop to assign a value to an int,
this will throw a NullPointerException.
If you changed Line 2 to the following code:
"for (Integer b : bArray) { // Line 2" or
"for (var b : bArray) { // Line 2", no such error would occur.
 */
public class Test1 {
    public static void main(String[] args) {

        int[] aArray = new int[3];
        Integer[] bArray = new Integer[3];
        aArray[2] = 1;
        bArray[0] = 1;  // Line 1

        for (int a : aArray) {
            System.out.print(a + " ");
        }
        System.out.println("");
        for (int b : bArray) {  // Line 2
            System.out.print(b + " ");  // Line 3
        }

    }
}