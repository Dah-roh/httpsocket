import java.util.Timer;

public class Main {

    public static void main(String[] args) {

        //Timer style of scheduling
        Task newTask = new Task("Daro");
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(newTask, 5000, 5000);


        //https://crontab.guru/
        //Cron expression style
        //1st * every minute
        //2nd * ''   hour
        //3th *  ''  week
        //4rd * ''   month
        //5th *  ''   day of the month
        //6th *  ''  day of the week
        //@Scheduled(cron = 0 12 * * * *)

        //@Scheduled-->SpringBoot
    }
}
