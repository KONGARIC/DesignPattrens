package FlyWeightDesignPattren;

import java.util.Random;

public class Lobby {
    private static String playerType[]={"HitmanPLayer","SherlockHomesPlayrer"};

    public static String getPlayer(){
        Random r=new Random();
        int randomNum=r.nextInt(playerType.length);
        return playerType[randomNum];
    }
}
