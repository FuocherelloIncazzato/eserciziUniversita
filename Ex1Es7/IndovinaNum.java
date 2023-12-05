package Ex1Es7;
import java.util.Scanner;
public class IndovinaNum{
    public static int [] numeriDaIndovinare = new int[5];
    public static boolean [] indovinato = new boolean[5];
    public static int [] numeroTentativi = new int[5];
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        char scelta='y';
        int giocate=0;
        giocate=utility.indovinaNum(giocate);
        do {
            System.out.println("vuoi giocare di nuovo? y/n");
            scelta = myobj.next().charAt(0);
                if(scelta=='y'){
                    System.out.println("giocate numero "+giocate+1);
                    giocate=utility.indovinaNum(giocate);
                } else if (scelta=='n') {
                    System.out.println("gioco chiuso");
                    utility.stampaIntArray(numeriDaIndovinare);
                    utility.stampaBooleanArray(indovinato);
                    utility.stampaIntArray(numeroTentativi);
                    System.out.println("giocate: "+giocate);
                }
        }while(scelta=='y');
    }

public static void aggiornaInformazioniPartite(int generato,boolean risultato,int tentativi,int giocate){
                if(giocate<numeriDaIndovinare.length) {
                    numeriDaIndovinare[giocate] = generato;
                }
                else{
                    numeriDaIndovinare[giocate-numeriDaIndovinare.length] = generato;
                }

    if(giocate<indovinato.length) {
        indovinato[giocate] = risultato;
    }
    else{
        indovinato[giocate-indovinato.length] = risultato;
    }

    if(giocate<numeroTentativi.length) {
        numeroTentativi[giocate] = tentativi;
    }
    else{
        numeroTentativi[giocate-numeroTentativi.length] = tentativi;
    }


    }


}

