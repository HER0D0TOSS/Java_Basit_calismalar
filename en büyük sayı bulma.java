public class Main {
    public static void main(String[] args) {
      int deger1 = 10;
      int deger2 = 35;
      int deger3 = 12;

      if ((deger1 > deger2) && (deger1 > deger3)){
          System.out.println("En büyük sayı: "+ deger1+ " deger1");
      }
      else if((deger2>deger1) && (deger2>deger3)){
          System.out.println("En büyük sayı: "+deger2+ " deger2");
      }
      else{
          System.out.println("En büyük sayı: "+deger3+ "deger3");
      }
    }
}
