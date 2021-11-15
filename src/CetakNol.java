import java.util.Scanner;

public class CetakNol {
    private static void CetakNOL(){
        int angka;
        Scanner inputUser= new Scanner(System.in);
        System.out.println("Masukkan jumlah = ");
        angka = inputUser.nextInt();
        for(int i=1;i<=angka;i++){
            for(int j=1;j<=angka;j++){
                System.out.print('0');
            }
            System.out.print('\n');
        }
    }


    public static void main(String[] args) {
        CetakNOL();
    }
}
