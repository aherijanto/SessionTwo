import java.util.Scanner;

public class SimpleMethod {

    static void CetakJudul(){
        String Title01;
        String Title02;

        Title01 = "Mencetak Judul Dalam Method";
        Title02 = "Mehod CetakJudul terpanggil dari Public Void Main";
        System.out.println("\n"+Title01);
        System.out.println(Title02);
    }

    private static void HitungLuasPersegi(){
        double Panjang;
        double Lebar;
        double Luas;
        Panjang = 10;
        Lebar = 15;
        Luas = Panjang * Lebar;
        System.out.println("\nLuas Persegi Panjang  = "+Luas);
    }

    private static void HitungLuasLingkaran(){
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        double jarijari;
        double LuasLingkaran;
        
        try{
            System.out.println("\nMasukkan Jari-Jari = ");
            jarijari = inputUser.nextDouble();
            LuasLingkaran = Math.PI * jarijari * jarijari;
            System.out.println("Luas Lingkaran = " + LuasLingkaran);
        }finally{
            inputUser.close();
        }
    }

    public static void main(String[] args) {
        String Judul01;
        String Judul02;

        Judul01 = "Cetak Kalimat Tanpa Method";
        Judul02 = "Ini adalah Contoh untuk mencetak Judl tanpa Method";
        System.out.println(Judul01);
        System.out.println(Judul02);

        // call method 'CetakJudul' at line 3
        CetakJudul();

        //Menghitung Luas Persegi Panjang dengan memanggil method HitungLuasPersegi
        HitungLuasPersegi();

        //Menghitung Luas Lingkaran dengan memanggil method HitungLuasLingkaran
        HitungLuasLingkaran();
    }
}
