import Model.TShirt;

public class ProduksiTShirt {
    public static void main(String[] args) {

        TShirt A = new TShirt("A","Hoodie","Katun",
                "Merah",false,false,2,
                250000,3000);
        A.Produksi();

        System.out.println("\n");

        TShirt B = new TShirt("B","Polo","Polyester",
                "Putih",true,true,1,
                120000,2000);
        B.Produksi();

    }
}
