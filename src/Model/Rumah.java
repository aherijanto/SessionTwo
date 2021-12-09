package Model;

public class Rumah {

    private String jenisRumah;
    private int jum_Rumah;
    private int jum_BatuBata;
    private int jum_Semen;
    private int jum_Besi;
    private int jum_Kayu;
    private int jum_Paku;
    private int jum_Pekerja;
    private int upahPerHari;
    private int jum_HariPengerjaan;

    public Rumah(String JenisRumah,int jumlahRumah,
                 int BatuBata, int Semen, int Besi,
                 int Kayu, int Paku, int Pekerja,
                 int Upah, int HariPengerjaan){

        this.jenisRumah = JenisRumah;
        this.jum_Rumah = jumlahRumah;
        this.jum_BatuBata = BatuBata;
        this.jum_Semen = Semen;
        this.jum_Besi = Besi;
        this.jum_Kayu = Kayu;
        this.jum_Paku = Paku;
        this.jum_Pekerja = Pekerja;
        this.upahPerHari = Upah;
        this.jum_HariPengerjaan = HariPengerjaan;
    }

    public void CetakDetailRumah(){
        System.out.println("Jenis Rumah = " + this.jenisRumah +"\n" +
                "Jumlah Rumah = " + this.jum_Rumah + " Unit \n" +
                "Jumlah Batu Bata = " + this.jum_BatuBata + " Buah\n"+
                "Jumlah Semen = " + this.jum_Semen + " Zak\n" +
                "Jumlah Besi = " +this.jum_Besi+ " Unit\n" +
                "Jumlah Kayu = " + this.jum_Kayu + " Potong\n"+
                "Jumlah Paku = " + this.jum_Paku + " Buah\n"+
                "Jumlah Pekerja = " + this.jum_Pekerja + " Orang\n"+
                "Upah Per Hari = Rp. " + this.upahPerHari + " \n"+
                "Hari Pengerjaan = " + this.jum_HariPengerjaan + " Hari");
    }
}
