package ChainOfResponsibilityDesignPattern.Classes;

import ChainOfResponsibilityDesignPattern.Interfaces.Game;

public class Level3 implements Game {
    Game nextLevel;
    @Override
    public void play() {
        System.out.println("Playing Level 3");
        int random = (int)(Math.random() * 10) + 1;
        System.out.println("Score : "+random);
        if(random>5){
            System.out.println("*******VICTORY******");
            nextLevel.play();

        }
        else{
            System.out.println("TRY GAIN");
        }

    }
    @Override
    public void goNextLevel(Game nextLevel) {
        this.nextLevel=nextLevel;
    }
}
