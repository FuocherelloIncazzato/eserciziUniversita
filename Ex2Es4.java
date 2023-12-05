import java.util.Scanner;

class Ex2Es4 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int lunghezzaMinima;

        // Chiede in input le due stringhe
        System.out.print("Inserisci la prima stringa: ");
        String stringa1 = tastiera.nextLine();
        System.out.print("Inserisci la seconda stringa: ");
        String stringa2 = tastiera.nextLine();

        // Calcola la lunghezza minima tra le due stringhe
        if (stringa1.length() <= stringa2.length())
            lunghezzaMinima = stringa1.length();
        else
            lunghezzaMinima = stringa2.length();

        // Calcola la lunghezza della più lunga prefissa
        int lunghezzaPrefissa = 0;
        while (lunghezzaPrefissa < lunghezzaMinima &&
                stringa1.charAt(lunghezzaPrefissa) == stringa2.charAt(lunghezzaPrefissa))
            lunghezzaPrefissa++;

        // Stampa il risultato
        System.out.println("Il massimo prefisso comune tra le stringhe \"" + stringa1 +
                "\" e \"" + stringa2 + "\" ha lunghezza " + lunghezzaPrefissa);
    }
}