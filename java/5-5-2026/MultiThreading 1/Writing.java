public class Writing extends Thread{
    
    public void bookWriting(){
        for(int i = 0; i<=10; i++){
            System.out.println("Book writing processing...");
        }
    }
    
    public void run(){
        bookWriting();
    }
}
