package ProxyDesignPattren;

public class DailyTasksImpl implements DailyTasks {
    @Override
    public void meetDoctor(String dayTime) {
        System.out.println("Meeting patient on "+dayTime);
    }
}
