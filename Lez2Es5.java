import java.util.Scanner;

public class Lez2Es5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("inserisci un numero compreso tra 0 e 127: ");
        int inputInt = myObj.nextInt();
        if(inputInt<0 || inputInt>127){
            System.out.println("ERRORE");
            System.exit(0);
        }
        String binario = "";
        while(inputInt>=1){
            binario=inputInt%2+binario;

            inputInt=inputInt/2;
            //System.out.println(inputInt);
        }
        if(binario.length()==7)
            System.out.println(binario);
        else{
            do{
                binario="0"+binario;
            }while(binario.length()!=7);
            System.out.println(binario);
        }
    }
}
