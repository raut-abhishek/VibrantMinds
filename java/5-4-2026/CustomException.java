public class CustomException {
    public static void main(String[] args) {
        System.out.println("Program Started");
        Site s = new Site();
        try {
            s.login(50);
            
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
        System.out.println("Program Ended");
    }
}
