import  java.util.function.Supplier;

public class SuppplierInterface {
    public static void main(String[] args) {
        Supplier <Integer> s1 = ()->{
            return 100;
        };
        System.out.println(s1.get());

        Supplier <String> s2 = ()->{
            return "INDIA";
        };

        System.out.println(s2.get());
    }
}
