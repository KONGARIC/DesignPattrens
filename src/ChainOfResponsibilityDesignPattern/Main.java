package ChainOfResponsibilityDesignPattern;

import ChainOfResponsibilityDesignPattern.Classes.GamePlay;

public class Main {
    public static void main(String[] arg){
        System.out.println("PLAYER 1");
        GamePlay player1 =new GamePlay();
        player1.start();
        System.out.println();
        System.out.println("PLAYER 2");
        GamePlay player2 =new GamePlay();
        player2.start();


    }
}
