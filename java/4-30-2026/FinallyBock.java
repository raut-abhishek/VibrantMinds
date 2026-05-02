

public class FinallyBock {
    public static void main(String[] args) {
        System.out.println("Program started");
        int a = 56;
        int b = 0;
        int c = 0;
        try{
            c= a/b;
            
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block executed");
        }
        System.out.println("Program ended");
    }
}
