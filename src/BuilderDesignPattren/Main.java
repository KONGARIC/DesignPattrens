package BuilderDesignPattren;

public class Main {
    public static void main(String[] arg)
    {


        //Sandwich s1=new Sandwich("Sweet","Tomoto","Tomoto","Italian");
        //Sandwich s1=new Sandwich("Tomoto","Tomoto","Italian","Sweet");
        //Sandwich s1=new Sandwich("Italian");
        Sandwich sandwich=new SubWay().setBread("classic Italian").setCheese("American").make();
        System.out.println(sandwich);

    }
}
