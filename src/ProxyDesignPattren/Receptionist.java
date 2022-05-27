package ProxyDesignPattren;

import java.util.Random;

public class Receptionist implements DailyTasks{

    boolean appointment=false;
    DailyTasks dailyTasks;
    public Receptionist(boolean appointment){
        if(appointment){
            this.appointment=true;
            dailyTasks=new DailyTasksImpl();
        }

    }
    @Override
    public void meetDoctor(String dayTime) {
        if(appointment){
            dailyTasks.meetDoctor(dayTime);
        }
        else {
            System.out.println("Please book an appointment to meet Doctor");
        }
    }
}
