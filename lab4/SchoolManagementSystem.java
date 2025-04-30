// Person.java
abstract class Person {
    abstract void performDuty();
}

// Student.java
class Student extends Person {
    @Override
    void performDuty() {
        System.out.println("Student: Studying for exams.");
    }
}

// Teacher.java
class Teacher extends Person {
    @Override
    void performDuty() {
        System.out.println("Teacher: Conducting a lecture.");
    }
}

// SchoolManagementSystem.java
public class SchoolManagementSystem {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Student();
        people[1] = new Teacher();
        people[2] = new Student();
        people[3] = new Teacher();

        for (Person person : people) {
            person.performDuty(); // Runtime polymorphism
        }

        //Example using a List
        java.util.List<Person> peopleList = new java.util.ArrayList<>();
        peopleList.add(new Student());
        peopleList.add(new Teacher());
        peopleList.add(new Student());
        peopleList.add(new Teacher());

        System.out.println("\nUsing a List:");
        for(Person person : peopleList){
            person.performDuty();
        }
    }
}