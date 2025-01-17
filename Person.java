public class Person {
    // Attributes for Person class
    private String name;
    private int age;
    private String address;

    // Some changes to create conflict
    // Some new changes by me to create conflict

    // Constructor for Person class
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Default Constructor
    public Person() {
        this.name = "Savina";
        this.age = 0;
        this.address = "Unknown";
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) { // Ensure age is non-negative
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // toString method
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a Person object using the parameterized constructor
        Person person1 = new Person("Alice", 25, "123 Main St");
        System.out.println(person1);

        // Create a Person object using the default constructor
        Person person2 = new Person();
        System.out.println(person2);

        // Modify attributes using setters
        person2.setName("Bob");
        person2.setAge(30);
        person2.setAddress("456 Elm St");
        System.out.println(person2);
    }
}
