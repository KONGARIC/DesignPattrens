package ProxyDesignPattren;

public class DoctorImpl implements Doctor{
    @Override
    public void meet(String dayTime) {
        System.out.println("Meeting client "+dayTime);
    }
}
