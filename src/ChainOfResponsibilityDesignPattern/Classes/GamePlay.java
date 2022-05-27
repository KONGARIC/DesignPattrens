package ChainOfResponsibilityDesignPattern.Classes;

import ChainOfResponsibilityDesignPattern.Interfaces.Game;

public class GamePlay {

    Game play;
    Game level1;
    Game level2;
    Game level3;
    Game level4;
    Game level5;

    public GamePlay(){

        System.out.println("############");
        System.out.println("RULES : 1.If you lose you neeed to start from level1");
        System.out.println("############");
        level1=new Level1();
        level2=new Level2();
        level3=new Level3();
        level4=new Level4();
        level5=new Level5();

        level1.goNextLevel(level2);
        level2.goNextLevel(level3);
        level3.goNextLevel(level4);
        level4.goNextLevel(level5);

    }
    public void start(){
        level1.play();
    }

}
