package FlyWeightDesignPattren;

public class SherlockHolmesPlayer implements Player{

    private String job;
    private String weapon;

    public SherlockHolmesPlayer(){
        job="slove the case";
    }

    @Override
    public void usingWeapon(String weapon) {
        this.weapon=weapon;
    }

    @Override
    public void play() {
        System.out.println("Sherlock "+job+" by using "+weapon+" as a clue");
    }
}
