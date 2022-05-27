package MediatorDesignPattren;

public class Paradise {
    private int id=1;
    private String food;

    private int deliveryBoyid;



    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
    public void deliveryOrder(int deliveryBoyid,String food){
        System.out.println("ACCEPTED ORDER");
        System.out.println("PREPARING : "+food);
        System.out.println("DELIVERY TO : "+deliveryBoyid);

    }
}
