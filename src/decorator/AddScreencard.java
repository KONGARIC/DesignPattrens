package decorator;

public class AddScreencard extends ItemDecorator{
    public AddScreencard(Item newItem) {
        super(newItem);
        System.out.println("Adding screencrad as well");
    }
    public String getDescription(){
        return tempItem.getDescription()+",Screencard";
    }


    public double getCost() {
        return tempItem.getCost()+500.00;
    }
}
