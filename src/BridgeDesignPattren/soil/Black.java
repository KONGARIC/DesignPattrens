package BridgeDesignPattren.soil;

import BridgeDesignPattren.plant.FruityPlant;

public class Black extends Soil{
    public void minarals()
    {
        System.out.println("xyz minarals");

    }
    public Black(FruityPlant plant)
    {
        super(plant);
        int a=plant.getMaxAge();
        plant.setMaxAge(a/2);
    }

}
