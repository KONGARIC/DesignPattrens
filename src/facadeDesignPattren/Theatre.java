package facadeDesignPattren;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    List<String> theatres=new ArrayList<String>();
    Theatre(){
        theatres.add("Inox");
        theatres.add("Imax");
        theatres.add("Asian");
    }
    public void getTheatres(){
        for(String theatre:theatres){
            System.out.println(theatre);
        }
    }
    public boolean theatreAvailabe(String theatre){
        if(theatres.contains(theatre)){
            System.out.println("In "+theatre+" theatre ");
            return true;
        }
        System.out.println(theatre+" not available");
        return false;
    }
}
