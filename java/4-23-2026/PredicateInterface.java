import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String [] args){
        Predicate <Integer> n = (Integer a)->{
            return a==100;
        };
        System.out.println(n.test(100));
        System.out.println(n.test(1000));

        Predicate<String> s = (String s1)->{
            String result = "";
            for(int i = 0; i<s1.length(); i++){
                result += s1.charAt(i);
            }
            return s1==result;
        };

        System.out.println(s.test("INDIA"));
        System.out.println(s.test("MADAM"));
    }

}
