package p;

public class A {
    public void publicMethod() {
        System.out.println("Public method in class A");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in class A");
    }

    void defaultMethod() {
        System.out.println("Default method in class A");
    }

    private void privateMethod() {
        System.out.println("Private method in class A");
    }


    public void accessPrivateMethod() {
        privateMethod();
    }
}