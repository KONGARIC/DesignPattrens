package ChainOfResponsibilityDesignPattern;

public class Level5 implements Game{
    private Game nextLevel;

    @Override
    public void play() {
        System.out.println("Playing Level 5");
        int random = (int)(Math.random() * 10) + 1;
        System.out.println("Score : "+random);
        if(random>5){
            System.out.println("*******VICTORY******");
            System.out.println("GAME OVER");

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
