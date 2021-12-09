import java.util.Scanner;

public class arrayInputNama{
    static String[] nama_mhs = new String[10];

    private static void input_nama(int index, String namaMHS){
        nama_mhs[index] = namaMHS; 
        System.out.println(nama_mhs[1]);
    }

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);        
        for(int i=0;i<10;i++){
            System.out.println("Masukan Nama ke " + i + " = ");
            String namamhs = inputUser.nextLine();
            input_nama(i, namamhs);
        }
    }
}