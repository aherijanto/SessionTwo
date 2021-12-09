public class GenapArray{

    private static void PrintGenapInArray(int[]myGenapInArray){
        for(int index=0;index<myGenapInArray.length;index++){
            System.out.println(myGenapInArray[index]);
        }   
    }
    private static boolean GenapTrueFalse(int angka){
        if(angka%2==0){
            return true;
        }else{
            return false;
        }
    }

    private static int[] CalculateGenapToArray(){
        int[] myGenapProcess = new int[20];
        for(int i=0;i<20;i++){
            int myAngka = i;
            boolean genapTrue = GenapTrueFalse(myAngka);
            if(genapTrue){
                myGenapProcess[i]=myAngka;
            }else{
                
            }
        }
        return myGenapProcess;
    }
    public static void main(String[] args) {
        int myGenapFinal[];
        myGenapFinal = CalculateGenapToArray();
        PrintGenapInArray(myGenapFinal);
    }
}