import java.lang.*;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("DEĞER GİRİNİZ: ");

        String veri =input.nextLine();

        StringBuilder datam = new StringBuilder();

        datam.append(veri);
        datam.reverse();

        //System.out.println(datam);
        if(veri.toString().equals(datam.toString())){
          System.out.println("Bu String Kendisinin Tersidir");
        }
        else{
            System.out.println("Bu String Kendisinin Tersi Değildir");
        }
    }
}
