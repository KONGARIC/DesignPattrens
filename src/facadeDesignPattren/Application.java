package facadeDesignPattren;

public class Mobile {
    public static void main(String[] arg)
    {
        BookMyShowFacade book=new BookMyShowFacade("cs@gmail.com","password");

        book.book("KGF@","Inox",2);
    }
}
