/*Correct Answer.
The call to the getChars method passes in a new unreferenced char array,
so the variable printed (myCharArray) contains no values.
If we had passed in the myCharArray reference as a parameter to getChars,
then the correct response would have been G (output would be: abcde*)
*/
public class Test1 {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder(5);  //  Line 1
        builder.append("abcdefghijklmnopqrstuvwxyz");            //  Line 2
        char[] myCharArray;                                     //  Line 3
        if ("hello" == "hello") myCharArray = new char[5];
        builder.getChars(0, 5, new char[5], 0);  //  Line 4
        System.out.println(new String(myCharArray).trim() + "*"); // Line 4
    }

}