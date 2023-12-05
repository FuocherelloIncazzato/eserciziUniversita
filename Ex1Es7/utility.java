import java.util.Scanner;

public class utility {
    public static int estraiNumeroCasuale(){
        int x;
        do{
            x = (int)(Math.random()*11);
        }while(x==0);
        return x;
    }
    public static int confrontaNumeri(int inserito, int generato){
        if(inserito<generato){
            System.out.println("Il numero da indovinare è più grande di "+inserito);
            return -1;
        }
        else if(inserito>generato){
            System.out.println("Il numero da indovinare è più piccolo di "+inserito);
            return 1;
        }
        else{
            System.out.println("Numero indovinato!");
            return 0;
        }


    }
    public static void checkSuggerimento(int inserito, int [] cronologia,int generato,int check){
        int tempMax=100;
        int tempMin=0;
        for(int old : cronologia){
            if(old!=0 && check==1 && old<inserito) {
                tempMax=Math.min(tempMax,old);
            } else if (old!=0 && check==-1 && inserito<old) {
                tempMin=Math.max(tempMin,old);
            }
        }
        if (check==1 && tempMax!=inserito && tempMax!=100) {
            System.out.println("Hai inserito " + inserito + ", ma se gia’ ti avevo detto che il numero da indovinare e’ piu’ piccolo di " + tempMax + "…");
        } else if (check==-1 &&  tempMin!=inserito && tempMin!=0) {
            System.out.println("Hai inserito " + inserito + ", ma se gia’ ti avevo detto che il numero da indovinare e’ piu’ grande di " + tempMin + "…");
        }

    }
    public static void stampaIntArray(int [] defaultArray) {
        for(int var : defaultArray){
            if(var!=0)
                System.out.print("--"+var);
        }
        System.out.print("\n");
    }
    public static void stampaBooleanArray(boolean [] defaultArray) {
        for(boolean var : defaultArray){
            System.out.print("--"+var);
        }
        System.out.print("\n");
    }
    public static int indovinaNum(int giocate){
        Scanner myobj = new Scanner(System.in);
        int generato = utility.estraiNumeroCasuale();
        int inserito,output,cont=0;
        int [] cronologiaMax = new int[10];
        int [] cronologiaMin = new int[10];
        do{
            System.out.println("inserisci un numero intero!: ");
            inserito = myobj.nextInt();
            output = utility.confrontaNumeri(inserito,generato);
            if(cont<10 && output==1) {
                cronologiaMax[cont] = inserito;
                utility.checkSuggerimento(inserito,cronologiaMax,generato,output);
            } else if (cont<10 && output==-1) {
                cronologiaMin[cont] = inserito;
                utility.checkSuggerimento(inserito,cronologiaMin,generato,output);
            }
            cont++;
        }while(output!=0 && cont<11);
        System.out.println("Il numero da indovinare: "+generato);
        if(output==0) {
            System.out.println("L'utente ha indovinato con "+(cont-1)+" tentativi!");
            boolean risultato = true;
            IndovinaNum.aggiornaInformazioniPartite(generato,risultato,cont-1,giocate);
            giocate++;
        }else {
            System.out.println("L'utente ha perso (che sfigato)!");
            boolean risultato = false;

            IndovinaNum.aggiornaInformazioniPartite(generato,risultato,cont-1,giocate);
            giocate++;
        }
        return giocate;
    }
}
