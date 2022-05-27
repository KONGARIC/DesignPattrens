package CommandDesignPattren;

public class AC implements Device{
    @Override
    public void on() {
        System.out.println("$%$%$%$%$");
        System.out.println("AC on");
    }

    @Override
    public void off() {
        System.out.println("$%$%$%$%$");
        System.out.println("AC off");
    }
}
