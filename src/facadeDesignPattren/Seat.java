package facadeDesignPattren;

import java.util.ArrayList;
import java.util.List;

public class Seat {

    static int[] seats=new int[100];
    Seat(){
        for(int i=0;i<100;i++){
            seats[i]=0;
        }
    }
    public void getSeats(){
        for(int s:seats){
            System.out.println(s);
        }
    }
    public boolean seatAvailabe(int s){
        if(seats[s]==0){
            seats[s]=1;
            System.out.println("number "+s+ " Seat booked");
            return true;
        }
        System.out.println("Seat is not available");
        return false;
    }
}
