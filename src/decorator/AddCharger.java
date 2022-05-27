package decorator;

public class AddCharger extends ItemDecorator{
    public AddCharger(Item newItem) {
        super(newItem);
        System.out.println("Adding charger as well");
    }
    public String getDescription(){
        return tempItem.getDescription()+",Charger";
    }


    public double getCost() {
        return tempItem.getCost()+300.00;
    }
}
