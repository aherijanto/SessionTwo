import Model.Rumah;

public class Pembangunan {

    public static void main(String[] args) {
        Rumah tipe36 = new Rumah("Tipe 36",300,
                120000,5000,8000,9000,15000,
                230,75000,180);

        tipe36.CetakDetailRumah();
        System.out.println("\n");

        Rumah tipe100 =new Rumah("Tipe 100",150,
                150000,8000,10000,15000,20000,
                300,75000,210);
        tipe100.CetakDetailRumah();

        System.out.println("\n");
        Rumah tipe200 =new Rumah("Tipe 200",100,
                350000,12000,12000,25000,21000,
                550,75000,240);
        tipe100.CetakDetailRumah();

    }
}
