class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }

    Parent(String message) {
        System.out.println("Parent constructor with message: " + message);
    }
}

class Child extends Parent {
    Child() {
        // Implicitly calls the no-argument constructor of the Parent class
        System.out.println("Child constructor");
    }

    Child(String message) {
        // Explicitly calls the parameterized constructor of the Parent class
        super(message);
        System.out.println("Child constructor with message: " + message);
    }
}

public class Test {
    public static void main(String[] args) {
       // Child child1 = new Child();  // Output: Parent constructor, Child constructor

        Child child2 = new Child("Hello");  // Output: Parent constructor with message: Hello, Child constructor with message: Hello
    }
}
