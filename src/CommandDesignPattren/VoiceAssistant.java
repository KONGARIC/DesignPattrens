package CommandDesignPattren;
import java.util.*;
import java.io.*;
public class VoiceAssistant {
    Scanner scanner=new Scanner(System.in);
    Device device;

    public void activated(){
        System.out.println("Hello chandra How can I help you....");
        String str=scanner.nextLine();

        if(str.contains("AC")){
            device=new AC();
            if(str.contains("on")){
                System.out.println("turning on the AC...");
                Command intention=new On(device);
                intention.execute();
            }
            else if(str.contains("off")){

                System.out.println("turning off the AC...");
                Command intention=new Off(device);
                intention.execute();
            }
        }
        else if(str.contains("light")){
            device=new Light();
            if(str.contains("on")){
                System.out.println("turning on the light...");
                Command intention=new On(device);
                intention.execute();

            }
            else if(str.contains("off")){

                System.out.println("turning off the light...");
                Command intention=new Off(device);
                intention.execute();
            }
        }


    }

}
