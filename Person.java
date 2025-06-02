public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Greet function
    public void greet() {
        System.out.println("Сайн байна уу? Миний нэр " + name + ", Би " + age + " настай.");
    }

    // Getters (optional)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}