public class Test1 {

    public static void main(String[] args) {  //  Line 1

        String hello="hello";

        for (var arg: args) {  // Line 2
            //StringBuilder sb = new StringBuilder(arg); // Line 3
            String sb = new String(arg);
            System.out.print(arg.equals(sb) +" ");  // Line 4
            System.out.print((arg==sb) + " ");
            System.out.print( (hello.equals(arg)) +" ");  // Line 5
            //System.out.println( (hello==arg)); // Line 6
            System.out.print( (hello.equals(arg.intern())) +" ");

        }
    }
}