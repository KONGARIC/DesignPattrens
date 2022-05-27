package MediatorDesignPattren;

public class Main {

    public static void main(String[] arg){
        User user1=new User(1,"chandra");
        user1.setFood("Biryani");
        user1.setRestarent("Paradise");
        Zemoto.order(user1.getId(),user1.getFood(),user1.getRestarent());
    }
}
