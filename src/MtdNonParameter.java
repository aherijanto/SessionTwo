import java.util.Scanner;

public class MtdNonParameter{
    private static void CetakJudul() {
        
    }

    private static void HitungGanjilGenap() {
        int angka;
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukkan Angka = ");
        angka = inputUser.nextInt();
        for(int i = 1;i<=angka;i++){
            if(i%2==0){
                System.out.println(i + " bilangan Genap");
            }else{
                System.out.println(i+ " bilangan ganjil");
            }
        }
    }
    public static void main(String[] args) {
        CetakJudul();
        HitungGanjilGenap();
        
        MtdNonParameter myValue = new MtdNonParameter();
        myValue.CetakJudul();
        myValue.HitungGanjilGenap();    
    }
}