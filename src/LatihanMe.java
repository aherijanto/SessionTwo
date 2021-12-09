import java.util.Scanner;

public class LatihanMe{
    
    private static boolean Process(int Angka){
        if ((Angka%3==0)&&(Angka%5==0)){
            return true;
        }else{
            return false;
        }
    }

    private static void PrintResult(int Number){
        boolean myProcess;
        myProcess = Process(Number);
        if(myProcess){
            System.out.println("Kelipatan 3 dan 5");
        }else{
            System.out.println("Bukan Kelipatan 3 dan 5");
        }
    }

    private static void PleaseInput(){
       Scanner inputSaya = new Scanner(System.in);
       int myNumber;
       System.out.println("Masukkan Angka =");
       myNumber = inputSaya.nextInt();
       PrintResult(myNumber);
    }

    public static void main(String[] args) {
        // Program untuk menentukan bilangan kelipatan 3 dan 5
        PleaseInput();
    }
}