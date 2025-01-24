public class StaticVsInstance {

    // Static variable
    static int staticVariable = 10;

    // Instance variable
    int instanceVariable = 20;

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
        // Accessing static variable
        System.out.println("Static variable: " + staticVariable);
        // Cannot access instance variables or methods here directly
        // System.out.println("Instance variable: " + instanceVariable);  // Error
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("This is an instance method.");
        // Accessing instance variable
        System.out.println("Instance variable: " + instanceVariable);
        // Accessing static variable (can access static variables in instance methods)
        System.out.println("Static variable: " + staticVariable);
    }

    public static void main(String[] args) {
        // Calling static method without creating an instance
        staticMethod();

        // Creating an object to call instance method
        StaticVsInstance obj = new StaticVsInstance();

        // Calling instance method using the object
        obj.instanceMethod();
    }
}
