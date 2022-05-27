package BridgeDesignPattren.plant;

abstract public class FruityPlant {
    int maxAge=0;

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int age) {
        maxAge = age;
    }
    public FruityPlant(int age)
    {
        maxAge=age;
    }

    public abstract void fruits();

}
