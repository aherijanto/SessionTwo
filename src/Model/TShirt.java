package Model;

import com.sun.jdi.Value;

public class TShirt {
    private String merkTShirt;
    private String jenisTShirt;
    private String bahanTShirt;
    private String warnaTShirt;
    private boolean lenganPendek;
    private boolean kerahTShirt;
    private int jumlahSakuTShirt;
    private int hargaTShirt;
    private int jumProduksiTShirt;

    public TShirt(String merk, String jenis,String bahan,
                  String warna, boolean lengan,boolean kerah,
                  int jumSaku, int harga, int jumProduksi){

        this.merkTShirt = merk;
        this.jenisTShirt = jenis;
        this.bahanTShirt = bahan;
        this.warnaTShirt = warna;
        this.lenganPendek = lengan;
        this.kerahTShirt = kerah;
        this.jumlahSakuTShirt = jumSaku;
        this.hargaTShirt = harga;
        this.jumProduksiTShirt = jumProduksi;
    }

    private int HitungTotalModal(int harga, int produksi){
        return harga*produksi;
    }

    public void Produksi(){
        String lengan;
        String kerah;

        if (this.lenganPendek){
            lengan= "Lengan Pendek";
        }else{
            lengan = "Lengan Panjang";
        }

        if(this.kerahTShirt){
            kerah = "Berkerah";
        }else{
            kerah = "Tidak Berkerah";
        }


        int totalModal = HitungTotalModal(this.hargaTShirt,
                this.jumProduksiTShirt);

        System.out.println("Merk "+ this.merkTShirt+"\n"+
                "Jenis TShirt "+this.jenisTShirt+"\n"+
                "Bahan "+this.bahanTShirt+"\n"+
                "Warna "+ this.warnaTShirt+"\n"+
                "Jenis Lengan "+lengan+"\n"+
                "Jenis Kerah "+kerah+"\n"+
                "Jumlah Saku "+this.jumlahSakuTShirt+"\n"+
                "Harga Modal"+ this.hargaTShirt+"\n"+
                "Jumlah Produksi "+ this.jumProduksiTShirt+"\n"+
                "Total Modal " + totalModal);

    }
}
