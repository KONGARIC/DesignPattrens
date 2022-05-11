package facadeDesignPattren;

import java.util.ArrayList;
import java.util.List;

public class Seat {

    List<String> movies=new ArrayList<String>();
    Seat(){
        movies.add("KGF2");
        movies.add("RRR");
        movies.add("Beast");
    }
    public void getMovies(){
        for(String movie:movies){
            System.out.println(movie);
        }
    }
    public boolean movieAvailabe(String movie){
        if(movies.contains(movie)){
            System.out.println("enjoy Movie booked");
            return true;
        }
        System.out.println("sorry Movie not available");
        return false;
    }
}
