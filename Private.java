class SuperClass {
    private int privateData = 42; 

    public int getPrivateData() {
        return privateData;
    }
}


class SubClass extends SuperClass {
    void display() {
        System.out.println("Accessing private data via method: " + getPrivateData());
    }
}

public class Private {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}
