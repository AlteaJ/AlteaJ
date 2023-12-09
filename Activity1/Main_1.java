public class Main_1{
    public static void main(String[] args) {
        // Create multiple instances of ExampleClass
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        StaticVariable obj3 = new StaticVariable();

        // Access and print the static variable
        System.out.println("Number of instances created: " + StaticVariable.instanceCount);
    }
}
