package FlyWeightDesignPattren;

import FlyWeightDesignPattren.Factory.PlayerFactory;
import FlyWeightDesignPattren.Game.Player;

public class GameZone {
    public static void main(String[] arg){
        for(int i=0;i<100;i++){


            String p=Lobby.getPlayer();
            System.out.println("*********************"+p+" "+ i+"**********************");
            Player player= PlayerFactory.createPlayer(p);
            player.usingWeapon(Weapon.getWeapon());
            player.play();
            System.out.println();

        }
    }

}
