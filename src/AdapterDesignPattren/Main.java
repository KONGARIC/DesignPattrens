package AdapterDesignPattren;

public class Main {
    public static void main(String[] arg)
    {
        Transportaion transportaion=new Transportaion();
        //Ola ola=new Ola();
        //transportation.setOla(ola);
        Ola ola=new OlaAdapter();
        transportaion.setOla(ola);

        transportaion.travell("koti","MGBS");
    }
}
