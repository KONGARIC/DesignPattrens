package BridgeDesignPattren.soil;


import BridgeDesignPattren.plant.FruityPlant;

public class Red extends Soil{
    public void minarals()
    {
        System.out.println("abc minarals");

    }
    public Red(FruityPlant plant)
    {
        super(plant);
        int a=plant.getMaxAge();
        plant.setMaxAge(a*2);
    }

}
