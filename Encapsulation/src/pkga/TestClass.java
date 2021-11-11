
/*
Correct Answer. SuperClass has no modifier which means it is package-private access.
This means that TestClass cannot extend it, so none of SuperClass's methods can be
accessed from TestClass.
 */
package pkga;

import pkgb.SuperClass;

public class TestClass extends SuperClass {
    public static void main(String[] args) {

        //** Insert code here **/
        new TestClass().printPublicData("Hello World");

        //new TestClass().printPackageData("Hello World");

        new TestClass().printProtectedData("Hello World");

        //new TestClass().printPrivateData("Hello World");
    }
}