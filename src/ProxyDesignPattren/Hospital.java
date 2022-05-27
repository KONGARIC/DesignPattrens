package ProxyDesignPattren;
import java.io.*;
import java.util.*;
public class Hospital {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] tt = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int k = 0; k < n; k++) {
                arr[k] = sc.nextInt();
            }
            Arrays.sort(arr);
            int[] distinctArray = new int[n];
            int index = 0;
            for (int j = 0; j < n; j++) {
                int test=0;
                while (j < n - 1 && arr[j] == arr[j + 1]){

                    test=1;
                    j++;}
                if(test==1){
                    continue;
                }

                distinctArray[index] = arr[j];
                index++;
            }
            tt[i] = distinctArray[0];

        }
        for (int i = 0; i < t; i++) {
            System.out.println(tt[i]);
        }
    }
}

