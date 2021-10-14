import java.util.*;
public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Boyuzunuzu Giriniz: ");

    int Boy = input.nextInt();

    if (Boy <=175){
        System.out.println("Kısa Boylusunuz");}
    else if (Boy>175){
        System.out.println("Uzun Boylusunuz");}
    }
}
