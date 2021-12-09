import java.util.Scanner;

public class Exercise {
  private static boolean GanjilGenap(int number){
      if(number%2==0){
          return true;
      }else{
          return false;
      }
  }

  private static void ShowMe(int angka) {
      boolean myGenap;
      myGenap = GanjilGenap(angka);
      if(myGenap){
          System.out.println("Bilangan Genap");
      }else{
          System.out.println("Bilangan Ganjil");
      }
  }

  private static void PleaseInput() {
    Scanner inputUser = new Scanner(System.in);  
    try{
      System.out.println("Masukkan Angka = ");
      int bilangan = inputUser.nextInt();
      ShowMe(bilangan);
    }finally{
          inputUser.close();
      }
  }
  public static void main(String[] args) {
      PleaseInput();
  }
}
