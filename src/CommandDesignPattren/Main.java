package CommandDesignPattren;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("listening.....");
            String command=sc.next();
            if(command.contains("zomo")){
                VoiceAssistant voiceAssistant=new VoiceAssistant();
                voiceAssistant.activated();

            }
        }
    }
}
