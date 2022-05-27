package facadeDesignPattren;

import java.util.ArrayList;
import java.util.List;

public class Movies {

    List<String> movies=new ArrayList<String>();
    Movies(){
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
            System.out.println(movie+" Movie booked");
            return true;
        }
        System.out.println("sorry Movie is not available");
        return false;
    }
}
