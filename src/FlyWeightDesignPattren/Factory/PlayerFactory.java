package FlyWeightDesignPattren.Factory;

import FlyWeightDesignPattren.Game.HitmanPlayer;
import FlyWeightDesignPattren.Game.Player;
import FlyWeightDesignPattren.Game.SherlockHolmesPlayer;

import java.util.HashMap;

public class PlayerFactory {

    private static HashMap<String, Player> map=new HashMap<>();
    public static Player createPlayer(String type){
        Player p=null;
        if(map.get(type)!=null){
            p=map.get(type);
        }
        else{
            if(type.equals("HitmanPLayer")){
                System.out.println("#####    Hitman Player Created #######");
                p=new HitmanPlayer();
            }
            else{
                System.out.println("#######    Sherlock Holmes Player is created #######");
                p=new SherlockHolmesPlayer();
            }
            map.put(type,p);
        }
        return p;
    }
}
