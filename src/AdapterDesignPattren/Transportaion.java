package AdapterDesignPattren;

public class Transportaion{
    private Ola ola=new OlaAdapter();

    public Ola getOla() {
        return ola;
    }

    public void setOla(Ola ola) {
        this.ola = ola;
    }

    public void travell(String pickup,String destination)
    {
        ola.ride(pickup,destination);
    }
}
