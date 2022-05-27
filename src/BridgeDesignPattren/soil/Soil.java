package BridgeDesignPattren.soil;


import BridgeDesignPattren.plant.*;

abstract public class Soil {
    public abstract void minarals();
    private FruityPlant plant;
    public Soil(FruityPlant plant)
    {
        this.plant=plant;

    }
    public void fruits()
    {
        plant.fruits();
    }
    public int getMaxAge()
    {
        return plant.getMaxAge();
    }
}
