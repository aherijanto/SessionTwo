
import java.util.Scanner;

public class MtdNonParameter{
    
    private static void CetakJudul() {
        
    }

    private static void HitungGanjilGenap() {
        int angka;
        Scanner inputUser = new Scanner(System.in);
        try{
            System.out.println("Masukkan Angka = ");
            angka = inputUser.nextInt();
            for(int i = 1;i<=angka;i++){
                if(i%2==0){
                    System.out.println(i + " bilangan Genap");
                }else{
                    System.out.println(i+ " bilangan ganjil");
                }
            }
        }finally{
            inputUser.close();
        }
        
    }
    public static void main(String[] args) {
        CetakJudul();
        HitungGanjilGenap();
        
    }
}