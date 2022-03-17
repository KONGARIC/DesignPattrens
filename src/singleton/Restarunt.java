package singleton;

public class Restarunt {
    private static int objects=0;
    private Restarunt()
    {
        objects++;
        System.out.println("number of objects "+objects);
    }
    public static Restarunt instance=new Restarunt();
    public static Restarunt getInstance()
    {
        if(instance==null)
        {
            instance=new Restarunt();
        }
        return instance;
    }
    public void pay(int amount)
    {
        System.out.println("Customer payed "+amount);
    }

}
