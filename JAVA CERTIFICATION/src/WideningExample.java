/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Declare and Initialize Variables
Sub-Topic: Widening
*/

public class WideningExample {
    static int myInt;
    public static void main(String[] args) {

        char myChar = 'a';  // this is integer value 97

        byte myByte = 0;   // remember this is narrowing.  0 is an int narrowed to a byte.
        short myShort;

        // Exact literal type assignment:
        int myInt = 0;
        float myFloat = 0.0f;
        double myDouble = 0.0;

        // Widening with literals
        long myLong = 0;   // widening an int to a long
        myDouble = 0.0f;   // widening a float literal to a double

        //Example of Widening with variables

        // Since assignments are right to left..
        //      value in myByte is widened to short when assigned to myShort
        //      value in myShort is widened to int when assigned to myInt
        //      value in myInt is widened to long when assigned to myLong
        //      value in myLong is widened to float when assigned to myFloat
        //      value in myFloat is widened to double when assigned to myDouble;

        myDouble = myFloat = myLong = myInt = myShort = myByte;

        System.out.println("Happy Widening");


    }
}