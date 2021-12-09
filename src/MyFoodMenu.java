import Model.Food;

import java.util.Scanner;

public class MyFoodMenu {
    public static void main(String[] args) {
        Food[] myMenu = new Food[5];

        myMenu[0] = new Food("001","Nasi Putih","Makanan",5000);
        myMenu[1] = new Food("002","Chicken Smash","Makanan",12000);
        myMenu[2] = new Food("003","Tempe Underpressure","Makanan",4000);
        myMenu[3] = new Food("004","Cute Es Teh","Minuman",3000);
        myMenu[4] = new Food("005","Lalapan","Makanan",2000);

        for(int indexArrayMenu=0;indexArrayMenu<myMenu.length;indexArrayMenu++){
            myMenu[indexArrayMenu].PrintFoodMenu();
        }
//------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------
        //meminta input dari user kemudian memasukan ke model array myMenu1
        Food[] myMenu1 = new Food[3];
        int loop=0;
        System.out.println("\nInput 3(Tiga) Data Makanan Baru");
        System.out.println("--------------------------------");
        for(int counter=0;counter<myMenu1.length;counter++){
            String kode;
            String nama;
            String kategori;
            int harga;
            loop++;

            Scanner userInput = new Scanner(System.in);
            System.out.println("\nInput Menu " + loop);
            System.out.println("--------------------------------");
            System.out.print("Masukkan Kode Makanan = ");
            kode = userInput.nextLine();
            System.out.print("Masukkan Nama Makanan = ");
            nama = userInput.nextLine();
            System.out.print("Masukkan Kategori = ");
            kategori = userInput.nextLine();
            System.out.print("Masukkan Harga = ");
            harga = userInput.nextInt();

            myMenu1[counter] = new Food(kode,nama,kategori,harga);
        }
        System.out.println("\n3(Tiga) Data Yang Diinput : ");
        System.out.println("--------------------------------");
        for(int counter=0;counter<myMenu1.length;counter++){
            myMenu1[counter].PrintFoodMenu();
        }
    }
}
