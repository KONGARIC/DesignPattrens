package BridgeDesignPattren.main;

import BridgeDesignPattren.soil.Black;
import BridgeDesignPattren.plant.*;
import BridgeDesignPattren.soil.*;

public class Main {
    public static void main(String[] arg)
    {
        Soil soil1=new Black(new Mango());
        soil1.minarals();
        soil1.fruits();

        System.out.println("plant max age "+soil1.getMaxAge());

        System.out.println("\n");
        Soil soil2=new Red(new Apple());
        soil2.minarals();
        soil2.fruits();
        System.out.println("plant max age "+soil2.getMaxAge());
    }
}
