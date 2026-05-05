
public class Site {
    private void homePage(){
        System.out.println("Welcome to your home!");
    }

    public void login(int age){
        System.out.println("Wellcome to this site");
        if(age>=70){
            homePage();
        }else{
            throw new InvalidAgeException();
        }
    }
}
