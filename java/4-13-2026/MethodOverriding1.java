class Animmal{
    void eat(String name){
        System.out.println(name + " eats from Animal class");
    }
}

class Dog extends Animmal{
    void eat(String name){
        System.out.println(name + " eats from Dog class");
    }
    
}



public class MethodOverriding1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat("Dog");
        
    }
}
