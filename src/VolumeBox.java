import java.util.Scanner;

public class VolumeBox{

    private static void Hitung(double p, double l, double t){
        double volume;
        volume = p * l * t;
        System.out.println("Volume Balok = " + volume);
    }

    public static void main(String[] args) {
        double panjang;
        double lebar;
        double tinggi;

        try {
            Scanner myInput = new Scanner(System.in);
            System.out.println("Masukkan Panjang = ");
            panjang = myInput.nextDouble();

            System.out.println("Masukkan Lebar = ");
            lebar = myInput.nextDouble();
                 
            System.out.println("Masukkan Tinggi = ");
            tinggi = myInput.nextDouble();

            Hitung(panjang,lebar,tinggi);
        } catch (Exception e) {
            //TODO: handle exception
            
        }

        
    }
}