package PrototypeDesignPattren;

public class Main {
    public static void main(String[] arg) throws CloneNotSupportedException {
        Website website1 = new Website();
        website1.setName("tutorialspoint");
        website1.loadPages();


        Website website2 = website1.clone();
        website2.setName("w3schools");
        //website2.loadPages(); it will featch pages from database
        website1.getPages().remove(0);
        System.out.println(website1);
        System.out.println(website2);
    }
}
