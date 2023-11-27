import java.util.Scanner;
public class Lez2Es3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        Scanner myObj3 = new Scanner(System.in);
        try {
            System.out.println("inserisci una stringa:");
            String messaggio = myObj.nextLine();
            System.out.println("inserisci un intero:");
            int posizione = myObj2.nextInt();
            System.out.println("inserisci un'altra stringa:");
            String stringa = myObj3.nextLine();
            if(messaggio.equals("") || stringa.equals("")){
                System.out.println("ERRORE stringhe vuote");
                System.exit(0);
            }
            if(posizione>0 || posizione<messaggio.length()){
                System.exit(0);
            }
            String substring1 = messaggio.substring(0,posizione);
            String substring2 = messaggio.substring(posizione);
            System.out.println(substring1+stringa+substring2);
        }
        catch (Exception e){
            System.out.println("ERRORE");
        }
    }
}
