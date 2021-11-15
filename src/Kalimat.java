import java.util.Scanner;

public class Kalimat {
    private static void CetakJudul() {
        String NIM;
        String Nama;
        String Kelas;
        String Project;

        NIM ="jkjjh";
        Nama = "Ary";
        Kelas = " 1";
        Project = " Word to Char";
    }

    private static void CetakKarakter(){
        String Kalimat;
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukkan Kalimat = ");
        Kalimat = inputUser.nextLine();
        for(int i=0;i<Kalimat.length();i++){
            char[] ch = Kalimat.toCharArray();
            System.out.println(ch[i]);
        }
        System.out.println("jumlah karakter = " + Kalimat.length());
        
    }
    public static void main(String[] args) {
        CetakJudul();
        CetakKarakter();
    }
    
}
