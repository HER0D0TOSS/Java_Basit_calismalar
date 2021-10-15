import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Notunuzu Giriniz: ");

        int notum = input.nextInt();

        if ((notum>=0) && (notum <30)){
            System.out.print("Not Durumu: "+notum+ " Çok Kötü");
        }
        else if((notum>=30)&&(notum<50)){
            System.out.print("Not Durumu: "+notum+ " Kötü");
        }
        else if((notum>=50)&&(notum<70)){
            System.out.print("Not Durumu: "+notum+" İdare Eder");
        }
        else if((notum>=70)&&(notum<85)){
            System.out.print("Not Durumu: "+notum+" İyi");
        }
        else{
            System.out.print("Not Durumu: "+notum+" Çok İyi");
        }
    }
}
