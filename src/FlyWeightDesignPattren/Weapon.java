package FlyWeightDesignPattren;

import java.util.Random;

public class Weapon {
    private static String weapons[]={
            "Short Gun",
            "Knife",
            "Rope",
    };
    public static String getWeapon(){
        Random r=new Random();
        int randomNum=r.nextInt(weapons.length);
        return weapons[randomNum];

    }
}
