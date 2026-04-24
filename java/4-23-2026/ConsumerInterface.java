import java.util.function.*;

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<Integer> c1 = (Integer a) -> {
            for (int i = 0; i <= a; i++) {
                System.out.print(i + " ");
            }
        };
        c1.accept(10);
    }
}