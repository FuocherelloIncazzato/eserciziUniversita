public class MetodiArray {
    public static int estraiNumeroCasuale(){
        int x;
        do{
            x = (int)(Math.random()*10);
        }while(x==0);
        return x;
    }
    public static int [] creaArray(int numeroElementi){
        int [] output = new int [10];
        for(int i=0;i<numeroElementi;i++){
            output[i] = MetodiArray.estraiNumeroCasuale();
        }
        return output;
    }
    public static void stampaIntArray(int [] defaultArray) {
        for(int var : defaultArray){
            if(var!=0)
                System.out.print("--"+var);
        }
        System.out.print("\n");
    }
}
