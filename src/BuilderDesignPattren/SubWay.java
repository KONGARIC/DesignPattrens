package BuilderDesignPattren;

public class SubWay {
    private String vegetables;
    private String sauces;
    private String cheese;
    private String bread;
    public SubWay(){
        vegetables="Onions+Tomatoes+Cucumbers+Olives";
        sauces="Mayonaise+Mustard+Honey mustard+Brown mustard+Sweet onion";
        cheese="Provolone+American+Mozzarella+Pepper Jack";
        bread="garlic bread";
    }

    public SubWay setVegetables(String vegetables) {
        this.vegetables = vegetables;
        return this;
    }

    public SubWay setSauces(String sauces) {
        this.sauces = sauces;
        return this;
    }

    public SubWay setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public SubWay setBread(String bread) {
        this.bread = bread;
        return this;
    }
    public Sandwich make()
    {
        return new Sandwich(bread,vegetables,sauces,cheese);
    }
}
