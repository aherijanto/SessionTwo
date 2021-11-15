
import java.util.Scanner;

public class StringToArray {
    private static void CetakJudul(){
        String NIM;
        String Nama;
        String Kelas;
        String Project;

        NIM = "098080989";
        Nama = "Ary H";
        Kelas = "1";
        Project = "Character Parsing";

        System.out.println(NIM);
        System.out.println(Nama);
        System.out.println(Kelas);
        System.out.println(Project);
    }

    private static void CetakKarakter(){
        String kalimat;
        char[] word;
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukkan Kalimat = ");
        kalimat = inputUser.nextLine();
        for(int i = 0; i<kalimat.length();i++){
            word = kalimat.toCharArray();
            System.out.println(word[i]);
        }
        System.out.println("Jumlah karakter dalam kalimat '"+kalimat+"'Adalah "+kalimat.length());
    }

    public static void main(String[] args) {
        CetakJudul();
        CetakKarakter();
    }
    
}
