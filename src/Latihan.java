import java.util.Scanner;

public class Latihan {
    
    private static boolean GanjilGenap(int Angka){
        if(Angka%2==0){
            return true;
        }else{
            return false;
        }
    }

    private static void PrintGG(int Number){
        boolean GG;
        GG = GanjilGenap(Number);
        if(GG){
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }
    }

    private static void PleaseInput(){
        Scanner inputUser = new Scanner(System.in);
        System.out.println("masukkan angka ");
        int angka = inputUser.nextInt();
        PrintGG(angka);
    }
    public static void main(String[] args) {
        PleaseInput();
    }
}
