package MediatorDesignPattren;

public class Zemoto {

    public static void order(int id,String food,String restarent) {
        System.out.println("***ORDER PLACED***");
        System.out.println("Restarent : "+restarent);
        System.out.println("Items : "+food+"\n");
        if(restarent.equalsIgnoreCase("paradise")){
            Paradise paradise=new Paradise();
            DeliveryBoy deliveryBoy=new DeliveryBoy(1);
            deliveryBoy.takeOrder(restarent,food,id);
            paradise.deliveryOrder(deliveryBoy.getId(),food);
        }
    }
}
