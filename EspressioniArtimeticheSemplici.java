import java.util.Scanner;

public class EspressioniArtimeticheSemplici {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Inserisci un'espressione arimetica del tipo(2 + 3 + 4 ), la prima e l'ultima roba inserita deve essere un operando(numero compreso tra 0 e 9) e le operazioni consentite cono il + e il -");
        String espressione = myobj.next();
        boolean check = controllaValiditaEspressione(espressione);
        if(check) {
            int risultato=valutaOperando(espressione);
            System.out.println("espressione valida uguale a: "+risultato);
        }else
            System.out.println("espressione non valida");



        //System.out.println((int)'-');

    }
    public static boolean controllaValiditaEspressione(String espressione){
        boolean check=true;
        if(espressione.charAt(0)==43 || espressione.charAt(espressione.length()-1)==43 || espressione.charAt(0)==45 || espressione.charAt(espressione.length()-1)==45){
            //System.out.println("qui1");
            check=false;
        }else {
            for (int i = 0; i < espressione.length(); i++) {
                if(i % 2 == 0 && espressione.charAt(i)-48 < 1 && espressione.charAt(i)-48 > 9) {
                    check = false;
                    //System.out.println(espressione.charAt(i));
                    //System.out.println("qui2");
                }
                if(i % 2 != 0 && espressione.charAt(i) != 43 && espressione.charAt(i) != 45) {
                    check = false;
                    //System.out.println(espressione.charAt(i));
                    //System.out.println("qui3");
                }
            }
        }
        return check;
    }
    public static int valutaOperando(String espressione){
        boolean operatore=true;
        int risultato=0;
        for (int i = 0; i < espressione.length(); i++) {
            if(i%2!=0 && espressione.charAt(i)==43)
                operatore=true;
            else if (i%2!=0 && espressione.charAt(i)==45)
                operatore=false;

            if(i%2==0 && operatore){
                risultato=risultato+(espressione.charAt(i)-48);
            } else if (i%2==0 && !operatore) {
                risultato=risultato-(espressione.charAt(i)-48);
            }
        }
        return risultato;
    }
}

