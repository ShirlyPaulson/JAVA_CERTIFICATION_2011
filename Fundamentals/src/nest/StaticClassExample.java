package nest;

public class StaticClassExample {
    public static void main(String[] args) {
        // Reference static field on static nested class directly:
        System.out.println(EnclosingClass.NestedStaticClass.staticName);

        // Reference static method on static nested class directly:
        System.out.println(EnclosingClass.NestedStaticClass.getStaticName());

        // Reference enum on static nested class directly:
        System.out.println(EnclosingClass.NestedStaticClass.Colors.BLUE);

        // Local variable declaration using a nested class's interface
        EnclosingClass.NestedStaticClass.NestedInterface n;

        // Create an instance of the static class
        EnclosingClass.NestedStaticClass nInstance = new EnclosingClass.NestedStaticClass();
        System.out.println(nInstance.getInstanceName());
    }
}