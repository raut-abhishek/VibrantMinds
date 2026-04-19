class Person {
    private String name;
    private int age;
    private String city;

    
    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public Person setCity(String city) {
        this.city = city;
        return this;
    }

    public void display() {
        System.out.println(name + " , " + age + " , " + city);
    }
}

public class MethodChaining {
    public static void main(String[] args) {
        new Person()
            .setName("Abhishek")
            .setAge(22)
            .setCity("Pune")
            .display();
    }
}