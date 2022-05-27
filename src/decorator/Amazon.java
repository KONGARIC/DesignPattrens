package decorator;

public class Amazon {
    public static void main(String[] arg)
    {
        Item obj=new AddCharger(new AddScreencard(new Mobile()));
        System.out.println("orders you placed....");
        String str=obj.getDescription();
        System.out.println(str);
        System.out.println("total cost....");
        double totalCost=obj.getCost();
        System.out.println(totalCost);


    }
}
