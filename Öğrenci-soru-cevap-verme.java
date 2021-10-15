import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("6 * 5 KAÇTIR ? ");

		int cevap = input.nextInt();

	    int sonuc = 30;

		if (cevap == sonuc){
			System.out.println("Tebrikler Doğru Cevap Verdiniz...");
		}
		else if(cevap !=sonuc){
			int a = 0;
			while (a<2){
				a+=1;
				//System.out.println(a);
				cevap = input.nextInt();
				if (cevap ==sonuc) {
					System.out.println("Tebrikler Doğru Cevap Verdiniz..");
				}
				else{
					System.out.println("Doğru Cevabı Veremediniz Cevap: "+ sonuc);
					break;
				}
			}
		}
    }
}
