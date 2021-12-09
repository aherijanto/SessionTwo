import java.util.Arrays;
import java.util.Scanner;

public class ArrayLat{
    
    private static void PrintNumberInput(int[] Angka){
        for(int i=0;i<Angka.length;i++){
            System.out.println("Angka "+ i + " Adalah = "+Angka[i]);
        }
    }

    private static int[] inputArrayNumber(){
        int myNumber[];
        myNumber = new int[5];
        
        Scanner inputAngka = new Scanner(System.in);
        for(int index=0;index<myNumber.length;index++){
            System.out.println("Masukan Angka " + index +" =");
            int myNumberInput = inputAngka.nextInt();
            myNumber[index] = myNumberInput;
        }
        return myNumber;
    }
    public static void main(String[] args) {
        int ArrayNumber[];
        ArrayNumber = inputArrayNumber();
        PrintNumberInput(ArrayNumber);
    } 
}