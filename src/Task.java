import java.util.TimerTask;

public class Task extends TimerTask {
    String myName;

    public Task(String myName) {
        this.myName = myName;
    }

    @Override
    public void run() {
        try {
            System.out.println("My name is "+myName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
