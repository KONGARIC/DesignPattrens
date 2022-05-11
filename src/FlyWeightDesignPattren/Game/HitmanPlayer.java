package FlyWeightDesignPattren;

public class HitmanPlayer implements Player{

    private String weapon;
    private String job;

    public HitmanPlayer(){
        job="killed a person";
    }
    @Override
    public void usingWeapon(String weapon) {
        this.weapon=weapon;
    }

    @Override
    public void play() {
        System.out.println("Hitman "+job+" by using "+weapon);
    }
}
