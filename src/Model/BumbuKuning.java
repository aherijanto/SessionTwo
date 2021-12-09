package Model;


import java.util.concurrent.TimeUnit;

public class BumbuKuning {
    private int jum_BawangMerah;
    private int jum_BawangPutih;
    private int jum_Ketumbar;
    private int jum_Kunyit;
    private int jum_Jahe;
    private int jum_Lengkuas;
    private int jum_Merica;
    private int jum_MinyakGoreng;
    private int jum_Kemiri;
    private int jum_GaramDapur;
    private int jum_GulaPasir;

    public BumbuKuning(int BaMer,int BPutih,int Ketumbar,
                       int Kunyit, int Jahe, int Lengkuas,
                       int Merica, int MinyakGoreng,
                       int Kemiri, int GaramDapur, int Gulapasir){

        this.jum_BawangMerah = BaMer;
        this.jum_BawangPutih = BPutih;
        this.jum_Ketumbar = Ketumbar;
        this.jum_Kunyit = Kunyit;
        this.jum_Jahe = Jahe;
        this.jum_Lengkuas = Lengkuas;
        this.jum_Merica = Merica;
        this.jum_MinyakGoreng = MinyakGoreng;
        this.jum_Kemiri = Kemiri;
        this.jum_GaramDapur = GaramDapur;
        this.jum_GulaPasir = Gulapasir;
    }

    public BumbuKuning(){
        this.jum_BawangMerah = 400;
        this.jum_BawangPutih = 200;
        this.jum_Ketumbar = 1;
        this.jum_Kunyit = 15;
        this.jum_Jahe = 5;
        this.jum_Lengkuas = 5;
        this.jum_Merica = 1;
        this.jum_MinyakGoreng = 150;
        this.jum_Kemiri = 100;
        this.jum_GaramDapur = 2;
        this.jum_GulaPasir = 2;

    }

    public void ProsesMasak(String Makanan,int Durasi) throws InterruptedException {
        System.out.println("Pesanan " + Makanan +
                " Sedang Diproses Selama "+ Durasi + " menit" );
        System.out.println("Silakan Menunggu ... " );

        for(int counterTime = Durasi;counterTime>0; counterTime--){

            System.out.println(counterTime);
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Proses makanan telah selesai, siap dihidangkan...\n");

    }
}
