package MediatorDesignPattren;

public class DeliveryBoy {

    private int id;
    private String restarent;
    private String food;

    public DeliveryBoy(int id) {
        this.id = id;

    }
    public void takeOrder(String restarent,String food,int userId){
        this.restarent = restarent;
        this.food = food;
        System.out.println("ACCEPTED ORDER");
        System.out.println("Restarent : "+restarent);
        System.out.println("Items : "+food);
        System.out.println("User Id "+userId+"\n");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRestarent() {
        return restarent;
    }

    public void setRestarent(String restarent) {
        this.restarent = restarent;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
