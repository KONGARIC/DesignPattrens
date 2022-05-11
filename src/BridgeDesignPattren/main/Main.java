package BridgeDesignPattren;

public class Main {
    public static void main(String[] arg)
    {
        Soil soil1=new Black(new Mango());
        soil1.minarals();
        soil1.fruits();
        System.out.println("plant max age "+soil1.getMaxAge());
    }
}
