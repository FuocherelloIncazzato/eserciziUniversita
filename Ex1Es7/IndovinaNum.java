import java.sql.Array;
import java.util.Scanner;
public class IndovinaNum{
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        int generato = Estrai.estraiNumeroCasuale();
        int inserito,output,cont=0;
        int [] cronologia = new int[10];
        do{
            System.out.println("inserisci un numero intero!: ");
            inserito = myobj.nextInt();
            output = Estrai.confrontaNumeri(inserito,generato);
            if(cont<10) {
                cronologia[cont] = inserito;
            }
            Estrai.checkStupido(inserito,cronologia);
            System.out.println("cont: "+cont);
            cont++;
        }while(output!=0 && cont<11);
        System.out.println("Il numero da indovinare: "+generato);
        if(output==0) {
            System.out.println("L'utente ha indovinato con "+cont+" tentativi!");

        }else
            System.out.println("L'utente ha perso (che sfigato)!");

    }
}
