package BuilderDesignPattren;

public class Sandwich {
    private String bread;
    private String vegetables;
    private String sauces;
    private String cheese;



    public Sandwich(String bread,String vegetables, String sauces, String cheese) {
        this.bread=bread;
        this.vegetables=vegetables;
        this.sauces=sauces;
        this.cheese=cheese;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", vegetables='" + vegetables + '\'' +
                ", sauces='" + sauces + '\'' +
                ", cheese='" + cheese + '\'' +
                '}';
    }
}
