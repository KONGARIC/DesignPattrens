package facadeDesignPattren;

public class Application {
    public static void main(String[] arg)
    {
        BookMyShowFacade book=new BookMyShowFacade("cs@gmail.com","123abc");

        book.book("KGF2","Inox xyz",2);
    }
}
