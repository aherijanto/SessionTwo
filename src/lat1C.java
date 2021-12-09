import java.util.Scanner;

public class lat1C{

    private static void CetakNama(String[] namanama){
        for(int y=0;y<namanama.length;y++){
            System.out.println("Nama : " + namanama[y]);
        }
    }
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String mynama[] = new String[6];
        for(int s=0;s<mynama.length;s++){
            System.out.println("Masukkan Nama");
            String nama = i.nextLine();
            mynama[s] = nama;
        }
        CetakNama(mynama);
    }
}