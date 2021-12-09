import Model.BumbuKuning;

public class DapurMama {

    public static void main(String[] args) throws InterruptedException {
        BumbuKuning SotoBetawi = new BumbuKuning(5,7,
                3,
                2,1,1,1,
                2,5,2,1);
        SotoBetawi.ProsesMasak("Soto Betawi ", 20);

        BumbuKuning AyamGoreng = new BumbuKuning();
        AyamGoreng.ProsesMasak("Ayam Goreng ", 10);
    }
}
