class Animmal{
    void eat(String name){
        System.out.println(name + " animal eats");
    }
}

class Dog extends Animmal{

}

public class Inheritance1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat("Dog");
        
    }
}

