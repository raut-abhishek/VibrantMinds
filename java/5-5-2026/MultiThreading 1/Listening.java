public class Listening extends Thread{
    public void musicListening(){
        for(int i = 0; i<=10; i++){
            System.out.println("Music listening processing...");
        }
    }

    public void run(){
        musicListening();
    }
}
