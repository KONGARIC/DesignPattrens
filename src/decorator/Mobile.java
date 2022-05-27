package decorator;

public class Mobile implements Item{
    @Override
    public String getDescription() {
        return "iPhone 14";
    }

    @Override
    public double getCost() {
        return 25000.00;
    }
}
