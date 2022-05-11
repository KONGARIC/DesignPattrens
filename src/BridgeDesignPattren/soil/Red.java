package BridgeDesignPattren;

public class Red extends Soil{
    public void minarals()
    {
        System.out.println("xyz minarals");

    }
    public Red(FruityPlant plant)
    {
        super(plant);
        int a=plant.getMaxAge();
        plant.setMaxAge(a/2);
    }

}
