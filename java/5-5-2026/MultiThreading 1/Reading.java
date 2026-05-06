public class Reading extends Thread{
    public void bookReading(){
        for(int i = 0; i<=10; i++){
            System.out.println("Book reading processing...");
        }
    }

    public void run(){
        bookReading();
    }
}
