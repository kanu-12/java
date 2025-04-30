import java.io.*;
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
public class Q5 {
    public static void main(String[] args) {
        Person person = new Person("Siddharth", 20);
        // Serialize the Person object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
            oos.writeObject(person);
            System.out.println("Person object serialized to person.txt");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
        // Deserialize the Person object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialized Person object: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}