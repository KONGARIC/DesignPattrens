package AdapterDesignPattren;

public class OlaAdapter implements Ola {
    Bike bike=new Bike();
    public void ride(String pickup,String destination)
    {
        bike.drive(pickup,destination);
    }
}
