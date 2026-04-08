class Student {
    // Private data (cannot be accessed directly)
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if(age > 0) {  // validation
            this.age = age;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        // Setting values using setter methods
        s.setName("Sushwanth");
        s.setAge(18);

        // Getting values using getter methods
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}