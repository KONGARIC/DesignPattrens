package decorator;

public abstract class ItemDecorator implements Item{

    protected Item tempItem;
    public ItemDecorator(Item newItem)
    {
        tempItem=newItem;
    }
    public String getDescription() {
        return tempItem.getDescription();
    }


    public double getCost() {
        return tempItem.getCost();
    }
}
