package facadeDesignPattren;

public class BookMyShowFacade {
    private String user;
    private String password;

    Welcome welcome;
    SignIn signIn;
    Movies movies;
    Theatre theatres;
    Seat seats;

    public BookMyShowFacade(String user,String password){
        this.user=user;
        this.password=password;
        welcome=new Welcome();
        signIn=new SignIn();
        movies=new Movies();
        theatres=new Theatre();
        seats=new Seat();

    }
    public void book(String movie,String theatre,int seat){
        if(signIn.activeAccount(user,password)){
            if(movies.movieAvailabe(movie)){
                if(theatres.theatreAvailabe(theatre)){
                    if(seats.seatAvailabe(seat)){
                        System.out.println("Enjoy..");
                    }
                }
            }
        }

    }

}
